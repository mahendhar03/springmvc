package com.mvc.mapper;

import java.util.Arrays;

import com.mvc.model.external.OrderedItem;
import com.mvc.model.external.Quantity;
import com.mvc.model.external.Quantity.QuantityType;
import com.mvc.model.internal.Order;

public class OrderDataMapper {
	public com.mvc.model.external.Order mapOrderData(Order inOrder) {
		com.mvc.model.external.Order extOrder=new com.mvc.model.external.Order();
		extOrder.setCustomerId(inOrder.getCustomerId());
		extOrder.setCustomerType(inOrder.getCustomerType());
		extOrder.setStoreName(inOrder.getStoreName());
		
		OrderedItem orderedItem=new OrderedItem();
		orderedItem.setItemName(inOrder.getItemName());
		
		Quantity quantity=new Quantity();
		quantity.setOrderedQuantity(inOrder.getOrderedQuantity());
		quantity.setQuantityType(QuantityType.valueOf(inOrder.getQuantityType()));
		
		orderedItem.setQuantity(quantity);
		
		extOrder.setOrderedItems(Arrays.asList(orderedItem));
		return extOrder;
	}
}
