package org.example.service.driver.impl;

import org.example.domain.driver.Driver;
import org.example.factory.driver.DriverFactory;
import org.example.repository.driver.DriverRepository;
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
public class DriverServiceImplTest {

    @Autowired
    private DriverServiceImpl service;
    private DriverRepository repository;
    private String driverId;
  //  Driver driver;

    Driver driver =DriverFactory.builderDriver("$3234",254,57,"Kuhle","Tyasi");


    private Driver getSaved()
    {
        return this.repository.findByDriverId(driverId).iterator().next();
    }

    @Test
    public void getDriverService() {
    }

    @Test
    public void retrieveByDesc() {
    }

    @Test
    public void create() {
    //    Driver create= this.repository.save(this.driver);

        Driver create =this.service.create(this.driver);
        System.out.println("in create, created = "+create);
        Assert.assertNotNull(create);
        System.out.println(this.driver);
 //       Assert.assertSame(create,this.driver);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
        Driver create =this.service.update(this.driver);

    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
    }
}