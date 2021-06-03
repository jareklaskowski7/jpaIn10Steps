package com.in28minutes.jpaIn10Steps.services;

import com.in28minutes.jpaIn10Steps.models.User;
import com.in28minutes.jpaIn10Steps.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserServiceCommandLineRunner.class);
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User is created: " + user);
        Optional<User> user1 = userRepository.findById(1L);
        log.info("User is retrieved: " + user1);
        List<User> users = userRepository.findAll();
        log.info("All Users: " + users);
    }
}
