package com.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mvc.model.internal.Order;


public class OrderValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		if(clazz.isAssignableFrom(Order.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Order bookOrder=(Order)target;
		if(bookOrder.getCustomerId().isEmpty()) {
			errors.rejectValue("customerId","customerId", "customer id not empty");
		}
	}
}
