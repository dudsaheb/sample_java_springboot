package com.shaik.userservice.controller;
import com.shaik.userservice.service.UserService;
import com.shaik.userservice.model.User;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController{

    public final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
}