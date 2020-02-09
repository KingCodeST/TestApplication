package org.example.controller.driver;

import org.example.domain.driver.Driver;
import org.example.factory.driver.DriverFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class DriverControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL ="http://localhost:8080/testapplication/driver";

    @Test
    public void create() {
        Driver driver= DriverFactory.builderDriver("&7960",675,50,"Athenkosi","Sethi");

        ResponseEntity<Driver> postResponse =restTemplate.postForEntity(baseURL +"/create",driver,Driver.class);
        System.out.println("The out come "+postResponse+"/n");

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }
}