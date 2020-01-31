package com.ngo.services;

import java.util.List;

import com.ngo.beans.Users;

public interface UserService {

    List<Users> findAll();

    Users findByUserEmail(String userEmail);

    void saveOrUpdateUsers(Users users);

    void deleteByUserEmail(String userEmail);

}