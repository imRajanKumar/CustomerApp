package com.customer.app.controller;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.customer.app.entity.Customer;
import com.customer.app.service.CityService;
import com.customer.app.service.CountryService;
import com.customer.app.service.CustomerService;
import com.customer.app.service.PaymentMethodService;
import com.customer.app.service.StateService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CountryService countryService;
	 
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private PaymentMethodService paymentMethodService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		/*final String uri = "https://g11.tcsgsp.in/Tax-Tool-Core/services/auth/gspGSTNAPIActivity/searchGSTINDetails";
	     
		
		String requestJson = "{\"gstin\":\"33AAACT5557G1ZE\"}";

		
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.set("Authorization", "Bearer 2241a089-5fc7-4f7a-8e51-b7b7b2d18750");
	    headers.set("clientCode", "Entity1");
	    headers.set("gstin", "33AAACT5557G1ZE");
	    HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
	     
	    System.out.println(result);*/
		
	
	    return "list-customers";
		
		
		
		
		
	}
	
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("country",countryService.getCountry());

		theModel.addAttribute("customer", theCustomer);
		theModel.addAttribute("id", theCustomer.getId());

		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer,@RequestParam("Save") String theId) {
		
		System.out.println("id "+theId);
		// save the customer using our service
		theCustomer.setStatus("inactive");
		theCustomer.setCreatedate(LocalDateTime.now());
		customerService.saveCustomer(theCustomer);	
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Customer theCustomer = customerService.getCustomer(theId);	
		
		theModel.addAttribute("country",countryService.getCountry());
		String cid=theCustomer.getCountry();
		String sid=theCustomer.getState();
		theModel.addAttribute("state",stateService.getState(cid));
		theModel.addAttribute("pmethod",paymentMethodService.getPaymentMethod(cid));

		theModel.addAttribute("city",cityService.getCity(sid));
		theModel.addAttribute("desc",countryService.getCountry(cid));
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);
		
		// send over to our form		
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		
		// delete the customer
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
	}

	@GetMapping("/search")
	public String searchCustomers(@RequestParam("theSearchName") String theSearchName,
									Model theModel) {

		// search customers from the service
		List<Customer> theCustomers = customerService.searchCustomers(theSearchName);
				
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);

		return "list-customers";		
	}
	
	
	
	@ResponseBody
	@GetMapping("loadStatesByCountry/{id}")
	public String loadStatesByCountry(@PathVariable("id") String id) {
	
		
		Gson gson = new Gson();
		return gson.toJson(stateService.getState(id));
	}
	
	@ResponseBody
	@GetMapping("loadPaymentMethodsByCountry/{id}")
	public String loadPaymentMethodsByCountry(@PathVariable("id") String id) {
	
		
		Gson gson = new Gson();
		return gson.toJson(paymentMethodService.getPaymentMethod(id));
	}
	
	
	@ResponseBody
	@GetMapping("loadCityByState/{id}")
	public String loadCityByState(@PathVariable("id") String id) {
	
		
		Gson gson = new Gson();
		return gson.toJson(cityService.getCity(id));
	}
	
	
	@ResponseBody
	@GetMapping("loadDescByCountry/{id}")
	public String loadDescByCountry(@PathVariable("id") String id) {
	
		
		Gson gson = new Gson();
		return gson.toJson(countryService.getCountry(id));
	}
	

}












