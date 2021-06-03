package com.in28minutes.jpaIn10Steps.services;

import com.in28minutes.jpaIn10Steps.models.User;
import com.in28minutes.jpaIn10Steps.repositories.UserRepository0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceCommandLineRunner0 implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserServiceCommandLineRunner0.class);
    private UserRepository0 userRepository0;

    @Autowired
    public void setUserRepository0(UserRepository0 userRepository0) {
        this.userRepository0 = userRepository0;
    }

    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        userRepository0.saveUser(user);
        log.info("New User is created: " + user);
    }
}
