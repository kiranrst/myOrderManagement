package com.myorder.model;

public class UserDetails {
	
	private String userId;
	private String userName;
	private String address;
	private long contactNo;
	private long alternateNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public long getAlternateNo() {
		return alternateNo;
	}

	public void setAlternateNo(long alternateNo) {
		this.alternateNo = alternateNo;
	}

}
