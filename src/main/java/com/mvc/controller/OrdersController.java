package com.mvc.controller;


import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.mvc.mapper.OrderDataMapper;
import com.mvc.model.internal.Order;
import com.mvc.service.OrderServiceInvoker;

public class OrdersController extends SimpleFormController {
	
	private OrderServiceInvoker orderServiceInvoker;
	
	private OrderDataMapper orderDataMapper;

	@Override
	protected ModelAndView onSubmit(Object command, BindException errors) throws Exception {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("succes-order");
		//modelAndView.addObject("orderId", UUID.randomUUID().toString());
		Order order=(Order)command;
		String status=orderServiceInvoker.makeOrder(orderDataMapper.mapOrderData(order));
		modelAndView.addObject("status", status);
		return modelAndView;
	}

	public void setOrderServiceInvoker(OrderServiceInvoker orderServiceInvoker) {
		this.orderServiceInvoker = orderServiceInvoker;
	}

	public void setOrderDataMapper(OrderDataMapper orderDataMapper) {
		this.orderDataMapper = orderDataMapper;
	}
	
	

}
