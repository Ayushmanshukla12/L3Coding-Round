package com.L3CodingRound.service.implementationClass;

import com.L3CodingRound.entities.User;
import com.L3CodingRound.repository.UserRepository;
import com.L3CodingRound.service.serviceInterface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplClass implements UserServiceInterface {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String addUser(User user) {

        userRepository.save(user);
        return "user added succesfully";
    }
}
