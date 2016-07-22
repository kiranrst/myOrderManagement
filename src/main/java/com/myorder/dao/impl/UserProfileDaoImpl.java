package com.myorder.dao.impl;

import java.math.BigDecimal;

import com.myorder.dao.UserProfileDao;
import com.myorder.model.UserDetails;

public class UserProfileDaoImpl implements UserProfileDao {

	@Override
	public BigDecimal createUser(UserDetails userInfo) {
		return null;
	}

	@Override
	public boolean modifyUser(UserDetails userInfo) {
		return false;
	}

	@Override
	public UserDetails fetchUserDetails(BigDecimal userId) {
		return null;
	}

}
