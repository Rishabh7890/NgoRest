package com.ngo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.beans.Admin;
import com.ngo.repos.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository ar;

	@Override
	public List<Admin> findAll() {
		return ar.findAll();
	}

	@Override
	public Admin findByAdminEmail(String adminEmail) {
		return ar.findByAdminEmail(adminEmail);
	}

	@Override
	public void saveOrUpdateAdmin(Admin admin) {
		ar.save(admin);

	}

	@Override
	public void deleteAdmin(String adminEmail) {
		ar.deleteByAdminEmail(adminEmail);

	}
}
