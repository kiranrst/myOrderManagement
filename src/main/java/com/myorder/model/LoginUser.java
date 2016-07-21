package com.myorder.model;

public class LoginUser {
	
	private String userid;
	private String password;
	
	public LoginUser(String userid, String passwd)
	{
		this.userid = userid;
		this.password = passwd;
	}

	public LoginUser() {
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return this.userid.hashCode()*this.password.hashCode();
	}
	
	@Override
	public boolean equals(Object obj2)
	{
		LoginUser userObj = (LoginUser)obj2;
		if((this == userObj) || ((this.getUserid().equalsIgnoreCase(userObj.getUserid())) && (this.getPassword().equalsIgnoreCase(userObj.getPassword()))))
			return true;
		return false;
	}
	

}
