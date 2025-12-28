package com.shaik.userservice.service;

import org.springframework.stereotype.Service;
import  com.shaik.userservice.model.User;

@Service
public class UserService {

   public User getUserById(Long id){
       return new User(id, "test name", "test@test.com");
   }

}