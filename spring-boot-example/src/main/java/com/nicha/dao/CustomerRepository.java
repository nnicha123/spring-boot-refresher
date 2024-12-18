package com.nicha.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicha.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
