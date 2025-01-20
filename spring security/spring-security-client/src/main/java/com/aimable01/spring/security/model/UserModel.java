package com.aimable01.spring.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String matchingPassword;
}
