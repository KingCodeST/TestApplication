package org.example.service.institution.impl;

import org.example.domain.driver.Driver;
import org.example.domain.institution.Institution;
import org.example.factory.institution.InstitutionFactory;
import org.example.repository.institution.InstitutionRepository;
import org.example.service.institution.InstitutionService;
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
public class InstitutionServiceImplTest {


    @Autowired
    private InstitutionService service;
    private InstitutionRepository repository;


    Institution institution= InstitutionFactory.GenericBuilder("District Six","#","Campus");

//    private Driver getSaved()
//    {
//        return this.repository.findAllById(driverId).iterator().next();
//    }


    @Test
    public void getInstitutionService() {
    }

    @Test
    public void retrieveByDesc() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Institution create=service.create(institution);
        System.out.println("institution was created, create = "+create);
        Assert.assertNotNull(create);
        System.out.println(this.institution);
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
}