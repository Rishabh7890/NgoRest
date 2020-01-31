package com.ngo.beans;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("admin")
public class Admin {
	@Id
	private String id;
	private String adminFname;
	private String adminLname;
	private String adminEmail;
	private String adminPassword;
	
	public Admin() {
		
	}
	public Admin(String id, String adminFname, String adminLname, String adminEmail, String adminPassword) {
		super();
		this.id = id;
		this.adminFname = adminFname;
		this.adminLname = adminLname;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdminFname() {
		return adminFname;
	}
	public void setAdminFname(String adminFname) {
		this.adminFname = adminFname;
	}
	public String getAdminLname() {
		return adminLname;
	}
	public void setAdminLname(String adminLname) {
		this.adminLname = adminLname;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
}