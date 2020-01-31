package com.ngo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.beans.Users;
import com.ngo.repos.UsersRepository;

@Service
public class UsersServiceImplemention implements UserService {

    @Autowired
    private UsersRepository ur;

    @Override
    public List<Users> findAll() {
        return ur.findAll();
    }

    @Override
    public Users findByUserEmail(String userEmail) {
        return ur.findByUserEmail(userEmail);
    }
    
    @Override
    public void saveOrUpdateUsers(Users users) {
        ur.save(users);
    }

    @Override
    public void deleteUsers(String id) {
        ur.deleteById(id);
    }
}  