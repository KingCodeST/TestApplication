package org.example.service.user.impl;

import org.example.domain.user.User;
import org.example.repository.user.UserRepository;
import org.example.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static UserService userService=null;

    @Autowired
    private UserRepository userRepository;

    private UserServiceImpl()
    {
        
    }

    @Override
    public User retrieveByDesc(String userDesc) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User read(String s) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
