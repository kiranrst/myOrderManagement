package com.myorder.dao;

import java.math.BigDecimal;
import java.util.List;

import com.myorder.model.LoginUser;
import com.myorder.model.OrderDetails;

public interface OrderServiceDao {
	boolean createOrder(OrderDetails orderInfo);

	boolean updateOrder(OrderDetails orderInfo);

	OrderDetails searchOrder(BigDecimal orderNumber);

	boolean cancelOrder(BigDecimal orderNumber);

	List<OrderDetails> listMyOrders(LoginUser user);

}
