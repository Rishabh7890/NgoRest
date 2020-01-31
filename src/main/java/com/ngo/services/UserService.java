package com.ngo.services;

import java.util.List;

import com.ngo.beans.Users;

public interface UserService {

    List<Users> findAll();

    Users findByUserEmail(String serEmail);

    void saveOrUpdateUsers(Users users);

    void deleteUsers(String id);

}