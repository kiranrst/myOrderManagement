package com.myorder.services.impl;

import java.math.BigDecimal;

import com.myorder.model.UserDetails;
import com.myorder.services.UserProfileService;

public class UserProfileServiceImpl implements UserProfileService{

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
