package com.ngo.services;

import java.util.List;

import com.ngo.beans.Admin;

public interface AdminService {

	List<Admin> findAll();

	Admin findByAdminEmail(String adminEmail);

	void saveOrUpdateAdmin(Admin admin);

	void deleteAdmin(String adminEmail);
}
