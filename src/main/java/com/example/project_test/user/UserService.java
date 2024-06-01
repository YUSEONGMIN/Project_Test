package com.example.project_test.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    
    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUser(int id) {
        return userRepository.findUser(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }


}
