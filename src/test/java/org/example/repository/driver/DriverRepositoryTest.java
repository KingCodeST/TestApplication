package org.example.repository.driver;

import org.example.domain.driver.Driver;
import org.example.factory.driver.DriverFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class DriverRepositoryTest {

    @Autowired
    private DriverRepository repository;
    private String driverId =null;
    private String fname ="Lulama";



    @Test
    public void DriverCreateTest() throws IOException{
        Driver driver= DriverFactory.builderDriver(65988.87,7040,"ilo","Lulama");
        Driver result =repository.save(driver);
        driverId =result.getDriverId();
        System.out.println(driverId);
        Assert.assertNotNull(driver);
    }


    @Test
    public void SiteDriver() throws IOException{
        Driver driver=repository.findByFname("Lulama");
        System.out.println(driver);
        Assert.assertNotNull(driver);
    }


}