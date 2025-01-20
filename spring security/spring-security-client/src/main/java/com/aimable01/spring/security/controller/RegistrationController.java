package com.aimable01.spring.security.controller;

import com.aimable01.spring.security.entity.User;
import com.aimable01.spring.security.model.UserModel;
import com.aimable01.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
    }
}
