package com.example.user.service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        log.info("Inside saveUser method of UserService.");
        return userRepository.save(user);
    }
}
