package com.L3CodingRound.controller;

import com.L3CodingRound.entities.User;
import com.L3CodingRound.service.implementationClass.UserServiceImplClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    private UserServiceImplClass userServiceImplClass;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return  this.userServiceImplClass.addUser(user);
    }
}
