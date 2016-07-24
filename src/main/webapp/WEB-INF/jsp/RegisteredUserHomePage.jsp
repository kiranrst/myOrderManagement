<%@page import="com.myorder.model.LoginUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoggedInUserHomePage</title>
</head>
<body>
	<h6>Welcome message to user You are in home page</h6>
	<h6>Please select the below URL to navigate in the application</h6>
	<a href="/WEB-INF/jsp/MyOrders.jsp">My Orders</a>
	<a href="/WEB-INF/jsp/createOrder.jsp">Create Order</a>
	<a href="/WEB-INF/jsp/SearchOrder.jsp">Search Order</a>
	<a href="/WEB-INF/jsp/ModifyOrder.jsp">Modify order specification</a>
	<a href="/WEB-INF/jsp/CancelOrder.jsp">Cancel Order</a>
</body>
</html>