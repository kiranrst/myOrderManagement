package com.myorder.dao.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.myorder.dao.OrderServiceDao;
import com.myorder.model.LoginUser;
import com.myorder.model.OrderDetails;

public class OrderServicesDaoImpl implements OrderServiceDao{

	@Override
	public boolean createOrder(OrderDetails orderInfo) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean updateOrder(OrderDetails orderInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderDetails searchOrder(BigDecimal orderNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(BigDecimal orderNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderDetails> listMyOrders(LoginUser user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Connection getDBConnection()
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(""jdbc:sqlserver://HOSP_SQL1.company.com;user=name;password=abcdefg;database=Test"");
		
		
		return null;
	}

}
