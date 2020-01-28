package org.example.controller.location;

import org.example.domain.location.LocationType;
import org.example.factory.location.LocationTypeFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class LocationTypeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private static final String BASE_URL="http://localhost:8080/testapplication/lookup/locationtype";


    @Test
    public void create() {
        LocationType locationType= LocationTypeFactory.builderDriver("#2019","Residence","Cape Town");

        ResponseEntity<LocationType> postResponse =restTemplate.postForEntity(BASE_URL+"/create",locationType,LocationType.class);
        System.out.println(postResponse);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    public void update() {
    }

    @Test
    public void read() {
    }
}