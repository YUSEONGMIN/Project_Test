package com.example.project_test.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    private Map<Integer, User> db = new HashMap<>();

    private int id = 1;

    public User findUser(int idx) {
        return db.get(idx);
    }

    public void save(User user) {
        db.put(id++, user);
    }
}
