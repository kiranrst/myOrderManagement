package com.myorder.services.impl;

import java.math.BigDecimal;
import java.util.List;

import com.myorder.model.LoginUser;
import com.myorder.model.OrderDetails;
import com.myorder.services.OrderServices;

public class OrderServiceImpl implements OrderServices{

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


}
