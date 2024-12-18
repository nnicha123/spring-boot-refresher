package com.nicha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicha.dto.NewCustomerRequest;
import com.nicha.entity.Customer;
import com.nicha.service.CustomerService;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
	
	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@PostMapping
	public void addCustomer(@RequestBody NewCustomerRequest request) {
		customerService.addCustomer(request);
	}
	
	@DeleteMapping("{customerId}")
	public void deleteCustomer(@PathVariable("customerId") Integer id) {
		customerService.deleteCustomer(id);
	}
	
	@PutMapping("{customerId}")
	public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody NewCustomerRequest updatedCustomer) {
		customerService.updateCustomer(id, updatedCustomer);
	}
}
