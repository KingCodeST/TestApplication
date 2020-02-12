package org.example.service.location.impl;

import org.example.domain.location.LocationType;
import org.example.factory.location.LocationTypeFactory;
import org.example.repository.location.LocationTypeRepository;
import org.example.service.location.LocationTypeService;
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
public class LocationTypeServiceImplTest {



    @Autowired
    private  LocationTypeService service;
    private LocationTypeRepository repository;

    LocationType locationType= LocationTypeFactory.builderDriver("Bellville","CPUT");

    @Test
    public void getLocationTypeService() {
    }

    @Test
    public void create() {
        LocationType create=this.service.create(this.locationType);
        System.out.println("locationtype is created = "+create);
        Assert.assertNotNull(create);
        System.out.println(this.locationType);
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