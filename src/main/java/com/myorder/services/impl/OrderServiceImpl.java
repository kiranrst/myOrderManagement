package com.myorder.services.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.myorder.dao.OrderServiceDao;
import com.myorder.model.LoginUser;
import com.myorder.model.OrderDetails;
import com.myorder.services.OrderServices;

public class OrderServiceImpl implements OrderServices{
	private OrderServiceDao orderServiceDao = null ;
	

	@Override
	public boolean createOrder(OrderDetails orderInfo) {
		
		return false;
	}

	@Override
	public boolean updateOrder(OrderDetails orderInfo) {
		return false;
	}

	@Override
	public OrderDetails searchOrder(BigDecimal orderNumber) {
		return null;
	}

	@Override
	public boolean cancelOrder(BigDecimal orderNumber) {
		return false;
	}

	@Override
	public List<OrderDetails> listMyOrders(LoginUser user) {
		return null;
	}
	
	private Connection getDBConnection()
	{
		Class.forName("");
		Connection connection = DriverManager.getConnection(url);
		
		
		return null;
	}


}
