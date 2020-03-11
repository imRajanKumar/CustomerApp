package com.customer.app.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.app.entity.Customer;
import com.customer.app.service.CountryService;
import com.customer.app.service.CustomerService;
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
	
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();

		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("country",countryService.getCountry());

		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the customer using our service
		customerService.saveCustomer(theCustomer);	
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Customer theCustomer = customerService.getCustomer(theId);	
		
		theModel.addAttribute("country",countryService.getCountry());
		
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
	
	
	

}












