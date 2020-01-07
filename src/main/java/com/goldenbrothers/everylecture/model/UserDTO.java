package com.goldenbrothers.everylecture.model;

public class UserDTO {
	
	private String userID;
	private String userPW;
	private String userName;
	private String authority;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String string) {
		this.userID = string;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
