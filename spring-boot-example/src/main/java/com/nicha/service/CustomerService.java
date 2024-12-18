package com.nicha.service;

import java.util.List;

import com.nicha.dto.NewCustomerRequest;
import com.nicha.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();
	void addCustomer(NewCustomerRequest newCustomerRequest);
	void updateCustomer(Integer customerId, NewCustomerRequest newCustomerRequest);
	void deleteCustomer(Integer customerId);
}
