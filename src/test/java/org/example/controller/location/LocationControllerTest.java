package org.example.controller.location;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class LocationControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL ="http://localhost:8080/location";



    @Test
    public void create() {

    }

    @Test
    public void getAll() {
    }
}