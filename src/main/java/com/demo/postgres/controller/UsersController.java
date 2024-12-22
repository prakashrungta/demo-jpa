package com.demo.postgres.controller;

import com.demo.postgres.entity.Users;
import com.demo.postgres.service.UsersService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "User Controller", description = "APIs for managing users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping
    @Tag(name = "User Controller", description = "APIs for managing users")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @PostMapping
    @Tag(name = "User Controller", description = "APIs for managing users")
    public Users insertUser(@RequestBody Users user) {
        return usersService.saveUser(user);
    }
}
