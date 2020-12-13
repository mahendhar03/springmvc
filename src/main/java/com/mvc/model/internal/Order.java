package com.mvc.model.internal;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Order {
	private String customerId;
	private String customerType;
	private String storeName;
	private String itemName;
	private BigDecimal orderedQuantity;
	private String quantityType;
}
