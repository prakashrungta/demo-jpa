package com.demo.postgres.service;


import com.demo.postgres.entity.Users;

import com.demo.postgres.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepo usersRepo;

    public List<Users> getUsers() {
        return usersRepo.findAll();
    }

    public Users saveUser(Users user) {
        return usersRepo.save(user);
    }
}
