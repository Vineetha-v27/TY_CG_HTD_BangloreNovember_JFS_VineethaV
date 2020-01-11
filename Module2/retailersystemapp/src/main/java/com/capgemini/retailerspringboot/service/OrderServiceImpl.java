package com.capgemini.retailerspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailerspringboot.dao.OrderDAO;
import com.capgemini.retailerspringboot.dto.OrderInfo;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDAO orderdao;

	@Override
	public boolean addOrder(OrderInfo order) {
		return orderdao.addOrder(order);
	}

	@Override
	public OrderInfo getOrder(int id) {
		return orderdao.getOrder(id);
	}

	@Override
	public List<OrderInfo> getAllOrders() {
		return orderdao.getAllOrders();
	}

	@Override
	public boolean deleteOrder(int id) {
		return orderdao.deleteOrder(id);
	}

}
