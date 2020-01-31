package com.ngo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ngo.beans.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

	public Admin findByAdminEmail(String adminEmail);

	public void deleteByAdminEmail(String adminEmail);

}
