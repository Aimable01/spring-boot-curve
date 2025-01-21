package com.aimable01.spring.security.event.listener;

import com.aimable01.spring.security.entity.User;
import com.aimable01.spring.security.event.RegistrationCompleteEvent;
import com.aimable01.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {

        // Create the verification token for the User
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token,user);

        // Send mail to the user
    }
}
