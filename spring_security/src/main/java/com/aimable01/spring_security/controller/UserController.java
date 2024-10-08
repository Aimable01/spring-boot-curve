package com.aimable01.spring_security.controller;

import com.aimable01.spring_security.model.Users;
import com.aimable01.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public Users register(@RequestBody Users user) {
        return userService.register(user);
    }
}
