package org.example.service.user.impl;

import org.example.domain.user.User;
import org.example.repository.user.UserRepository;
import org.example.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value ="serviceImpl")
public class UserServiceImpl implements UserService {

    private static UserService userService=null;

    @Autowired
    private UserRepository userRepository;

    private UserServiceImpl(){}

    public static UserService getService()
    {
        if(userService ==null) userService=new UserServiceImpl();
        return userService;
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User read(String s) {
        Optional<User> optionalUser=this.userRepository.findById(s);
        return optionalUser.orElse(null);
    }

    @Override
    public User update(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void delete(String s) {
        this.userRepository.deleteById(s);
    }

    @Override
    public User retrieveByDesc(String userDesc) {
       List<User>users =getAll();
       for(User user: users)
       {
           if(user.getFname().equalsIgnoreCase(userDesc))
               return user;
       }
        return null;
    }

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }
}
