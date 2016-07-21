package com.myorder.validate;

import java.util.HashMap;
import java.util.Map;

import com.myorder.model.LoginUser;

public class ValidateUser {

	private static Map<LoginUser, String> validUserList = new HashMap<LoginUser, String>();
	private LoginUser verifyUser = new LoginUser();
	static {
		
		validUserList.put(new LoginUser("sai", "kiran"), "kiran");
		validUserList.put(new LoginUser("samba", "rao"), "rao");
		validUserList.put(new LoginUser("gowtham", "gg"), "gg");
	}

	public ValidateUser(LoginUser user) {
			verifyUser = user;
	}

	/*
	 * valid whether the user is registered or not
	 */
	public boolean isValidUser() {
		if (validUserList.containsKey(verifyUser))
			return true;
		return false;
	}

}
