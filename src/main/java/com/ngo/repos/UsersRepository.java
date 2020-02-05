package com.ngo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ngo.beans.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

	public void deleteByScreenName(String screenName);

	public Users findByScreenName(String screenName);

}
