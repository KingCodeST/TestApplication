package org.example.service.location.impl;

import org.example.domain.driver.Driver;
import org.example.domain.location.Location;
import org.example.factory.location.LocationFactory;
import org.example.repository.location.LocationRepository;
import org.example.service.location.LocationService;
import org.junit.Assert;
import org.junit.Before;
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
public class LocationServiceImplTest {

    @Autowired
    private  LocationService service;
    private LocationRepository repository;

    Location location= LocationFactory.builderDriver("#SPT345","South point Residence","18.4590","-33.9382","");

    @Test
    public void getLocationService() {
    }

    @Test
    public void retrieveByDesc() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Location create =this.service.create(this.location);
        System.out.println("in create, created = "+create);
        Assert.assertNotNull(create);
        System.out.println(this.location);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
       // Location update =repository.findById("3ds");
      //  System.out.println("this has been, updated = "+update);



//        Employee employee = em.find(Employee.class, 1);
//
//        em.getTransaction().begin();
//        employee.setNickname("Joe the Plumber");
//        em.getTransaction().commit();

    }

    @Test
    public void delete() {
    }
}