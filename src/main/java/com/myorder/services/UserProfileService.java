package com.myorder.services;

import java.math.BigDecimal;

import com.myorder.model.UserDetails;

public interface UserProfileService {
	
	BigDecimal createUser(UserDetails userInfo);
	boolean modifyUser(UserDetails userInfo);
	UserDetails fetchUserDetails(BigDecimal userId);
	
}
