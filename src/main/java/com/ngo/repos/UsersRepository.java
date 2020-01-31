package com.ngo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ngo.beans.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

	public Users findByUserEmail(String userEmail);
	public void deleteByUserEmail(String userEmail);

}
