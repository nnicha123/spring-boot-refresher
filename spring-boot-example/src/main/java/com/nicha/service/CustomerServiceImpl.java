package com.nicha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicha.dao.CustomerRepository;
import com.nicha.dto.NewCustomerRequest;
import com.nicha.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void addCustomer(NewCustomerRequest newCustomerRequest) {
		Customer customer = new Customer();
		customer.setName(newCustomerRequest.name());
		customer.setEmail(newCustomerRequest.email());
		customer.setAge(newCustomerRequest.age());
		customerRepository.save(customer);
		return;
		
	}

	@Override
	public void updateCustomer(Integer customerId, NewCustomerRequest updatedCustomer) {
		Customer customer = new Customer();
		customer.setName(updatedCustomer.name());
		customer.setAge(updatedCustomer.age());
		customer.setEmail(updatedCustomer.email());
		customer.setId(customerId);
		customerRepository.save(customer);
		return;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		customerRepository.deleteById(customerId);
		return;
	}


	
}
