package com.ngo.services;

import java.util.List;

import com.ngo.beans.Users;

public interface UserService {

    List<Users> findAll();

    void saveOrUpdateUsers(Users users);

    void deleteUser(String screenName);

	Users findByScreenName(String screenName);

}