package com.myorder.dao;

import java.math.BigDecimal;

import com.myorder.model.UserDetails;

public interface UserProfileDao {
	BigDecimal createUser(UserDetails userInfo);
	boolean modifyUser(UserDetails userInfo);
	UserDetails fetchUserDetails(BigDecimal userId);
}
