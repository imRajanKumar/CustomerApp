package com.customer.app.controller;


import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
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
import com.customer.app.service.ActualQmService;
import com.customer.app.service.BankKeyService;
import com.customer.app.service.CountryService;
import com.customer.app.service.CurrencyService;
import com.customer.app.service.CustomerService;
import com.customer.app.service.GSTFilingService;
import com.customer.app.service.IDTypeService;
import com.customer.app.service.IncotermService;
import com.customer.app.service.LegalEntityService;
import com.customer.app.service.MaterialTypeService;
import com.customer.app.service.PaymentBlockService;
import com.customer.app.service.PaymentMethodService;
import com.customer.app.service.PaymentTermService;
import com.customer.app.service.StateService;
import com.customer.app.service.TitleService;
import com.customer.app.service.VendorClassService;
import com.customer.app.service.VendorGroupService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	   private static final Logger LOGGER = Logger.getLogger(CustomerController.class);
	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CountryService countryService;
	 
	@Autowired
	private StateService stateService;
	
	
	@Autowired
	private PaymentMethodService paymentMethodService;
	
	@Autowired
	private VendorGroupService vendorGroupService;
	
	@Autowired
	private TitleService titleService;
	
	@Autowired
	private MaterialTypeService materialTypeService;
	
	@Autowired
	private GSTFilingService gSTFilingService;
	
	@Autowired
	private IncotermService incotermService;
	
	@Autowired
	private CurrencyService currencyService;
	
	@Autowired
	private PaymentTermService paymentTermService;
	
	@Autowired
	private BankKeyService bankKeyService;
	
	@Autowired
	private VendorClassService vendorClassService;
	
	@Autowired
	private PaymentBlockService paymentBlockService;
	
	@Autowired
	private ActualQmService actualQmService;
	
	@Autowired
	private IDTypeService IDTypeService;
	
	@Autowired
	private LegalEntityService legalEntityService;
	
	
	
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
		
	
	    return "roleview";
		
		
		
		
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		
		LOGGER.info("HELLLLLLLLLLLLLLLLLLLLLLL");
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("country",countryService.getCountry());

		theModel.addAttribute("customer", theCustomer);
		theModel.addAttribute("id", theCustomer.getId());
		theModel.addAttribute("vendergroup",vendorGroupService.getVendorGroup());
		theModel.addAttribute("title",titleService.getTitle());
		theModel.addAttribute("materialtype",materialTypeService.getMaterialType());
		theModel.addAttribute("gstfiling",gSTFilingService.getGSTFiling());
		theModel.addAttribute("incoterm",incotermService.getIncoterm());
		theModel.addAttribute("currency",currencyService.getCurrency());
		theModel.addAttribute("paymentterm",paymentTermService.getPaymentTerm());
		theModel.addAttribute("paymentblock",paymentBlockService.getPaymentBlock());
		theModel.addAttribute("actualqmsys",actualQmService.getActualqm());
		theModel.addAttribute("legalentity",legalEntityService.getLegalEntity());
		theModel.addAttribute("idtype",IDTypeService.getIDType());


		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer,@RequestParam(name="Save",required = false) String action) {
		
		System.out.println("action: "+action);
		// save the customer using our service
		if(action!=null && action.equals("Save"))
		{
			theCustomer.setStatus("Draft");
		}
		else
		{
			theCustomer.setStatus("Inactive");
		}
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
		String vgroup=theCustomer.getVenderGroup();
		String v="";
		if(vgroup=="TVO2" || vgroup=="TVO2A" || vgroup=="TV03C" || vgroup=="TVO3D"  )
		{
			v="I";
		}
		else
		{
			v="D";
		}
		theModel.addAttribute("venderclass",vendorClassService.getVendorClass(v));
		theModel.addAttribute("state",stateService.getState(cid));
		theModel.addAttribute("bankkey",bankKeyService.getBankKey(cid));
		
		theModel.addAttribute("pmethod",paymentMethodService.getPaymentMethod(v));
		theModel.addAttribute("vendergroup",vendorGroupService.getVendorGroup());
		theModel.addAttribute("title",titleService.getTitle());
		theModel.addAttribute("materialtype",materialTypeService.getMaterialType());
		theModel.addAttribute("gstfiling",gSTFilingService.getGSTFiling());
		theModel.addAttribute("desc",countryService.getCountry(cid));
		theModel.addAttribute("incoterm",incotermService.getIncoterm());
		theModel.addAttribute("currency",currencyService.getCurrency());
		theModel.addAttribute("paymentterm",paymentTermService.getPaymentTerm());
		theModel.addAttribute("paymentblock",paymentBlockService.getPaymentBlock());
		theModel.addAttribute("actualqmsys",actualQmService.getActualqm());
		theModel.addAttribute("legalentity",legalEntityService.getLegalEntity());
		theModel.addAttribute("idtype",IDTypeService.getIDType());
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
	@GetMapping("loadBankKeyByCountry/{id}")
	public String loadBankKeyByCountry(@PathVariable("id") String id) {
		
		Gson gson = new Gson();
		return gson.toJson(bankKeyService.getBankKey(id));
	}
	
	@ResponseBody
	@GetMapping("loadDescByBankKey/{id}")
	public String loadDescByBankKey(@PathVariable("id") String id) {
		System.out.println("******  "+bankKeyService.getBankName(id));
		Gson gson = new Gson();
		return gson.toJson(bankKeyService.getBankName(id));
	}
	
	
	
	
	@ResponseBody
	@GetMapping("loadPaymentMethodsByVendorType/{id}")
	public String loadPaymentMethodsByCountry(@PathVariable("id") String id) {
	
		
		Gson gson = new Gson();
		return gson.toJson(paymentMethodService.getPaymentMethod(id));
	}
	
	@ResponseBody
	@GetMapping("loadVendorClassByVendorType/{id}")
	public String loadVendorClassByVendorType(@PathVariable("id") String id) {
	
		
		Gson gson = new Gson();
		return gson.toJson(vendorClassService.getVendorClass(id));
	}
	
	
	
	
	@ResponseBody
	@GetMapping("loadDescByCountry/{id}")
	public String loadDescByCountry(@PathVariable("id") String id) {
		Gson gson = new Gson();
		return gson.toJson(countryService.getCountry(id));
	}
	
	@ResponseBody
	@GetMapping("loadGLCodeByVenderGroup/{id}")
	public String loadGLCodeByVenderGroup(@PathVariable("id") String id) {
		Gson gson = new Gson();
		return gson.toJson(vendorGroupService.getGLCode(id));
	}
	
	
}












