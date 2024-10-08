package com.aimable01.spring_security.service;

import com.aimable01.spring_security.model.Users;
import com.aimable01.spring_security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public Users register(Users user) {
        return repo.save(user);
    }
}
