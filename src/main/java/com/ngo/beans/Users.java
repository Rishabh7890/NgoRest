package com.ngo.beans;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class Users {
	@Id
	private String id;
	private String name;
	private String screenName;
	private String twitterId;
	private String userPassword;
	private List<Donation> cart;

	public Users() {

	}

	public Users(String id, String name, String screenName, String twitterId, List<Donation> cart) {
		super();
		this.id = id;
		this.name = name;
		this.screenName = screenName;
		this.twitterId = twitterId;
		this.cart = cart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
