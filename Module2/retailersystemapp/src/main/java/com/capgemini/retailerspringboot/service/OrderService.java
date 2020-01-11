package com.capgemini.retailerspringboot.service;

import java.util.List;

import com.capgemini.retailerspringboot.dto.OrderInfo;

public interface OrderService {
	public boolean addOrder(OrderInfo order);

	public OrderInfo getOrder(int id);

	public List<OrderInfo> getAllOrders();

	public boolean deleteOrder(int id);


}
