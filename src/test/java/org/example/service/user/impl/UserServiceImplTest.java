package org.example.service.user.impl;

import org.example.domain.user.User;
import org.example.factory.user.UserFactory;
import org.example.repository.user.UserRepository;
import org.example.service.user.UserService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class UserServiceImplTest {

    private UserService service;

    @Autowired
    private UserRepository repository;

    static User user= UserFactory.GenericBuilder("215038142","siphokuhle","tyasi","078452378","45","");



    @Test
    public void getService() {
    }

    @Test
    public void create() {
        User create=this.service.create(user);
        System.out.println("in create, created = "+create);
        Assert.assertNotNull(create);
        System.out.println(this.user);


    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void retrieveByDesc() {
    }

    @Test
    public void getAll() {
    }
}