package com.aimable01.spring.security.service;

import com.aimable01.spring.security.entity.User;
import com.aimable01.spring.security.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
