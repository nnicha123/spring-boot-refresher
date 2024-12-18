package com.nicha.dto;

public record NewCustomerRequest(
		String name,
		String email,
		Integer age
	) {}