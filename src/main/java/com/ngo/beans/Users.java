package com.ngo.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class Users {
	@Id
	private String id;
	private String userFname;
	private String userLname;
	private String userEmail;
	private String userPassword;
	
	public Users() {
		
	}
	
	public Users(String id, String userFname, String userLname, String userEmail, String userPassword) {
		super();
		this.id = id;
		this.userFname = userFname;
		this.userLname = userLname;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
