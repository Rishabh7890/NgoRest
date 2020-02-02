package com.ngo.beans;

import java.util.List;

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
	private List<Donation> cart;

	public Users() {

	}

	public Users(String id, String userFname, String userLname, String userEmail, String userPassword,
			List<Donation> cart) {
		super();
		this.id = id;
		this.userFname = userFname;
		this.userLname = userLname;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.cart = cart;
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

	public List<Donation> getCart() {
		return cart;
	}

	public void setCart(List<Donation> cart) {
		this.cart = cart;
	}

}
