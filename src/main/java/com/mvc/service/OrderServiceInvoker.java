package com.mvc.service;

import org.springframework.web.client.RestTemplate;

import com.mvc.model.external.Order;

public class OrderServiceInvoker {

	private RestTemplate restTemplate;
	
	private String orderUrl;

	public OrderServiceInvoker() {
		System.out.println("Context created");
	}
	
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}

	public String makeOrder(Order order) {
		String orderStatus = restTemplate.postForObject(orderUrl, order, String.class);
		return orderStatus;
	}

}
