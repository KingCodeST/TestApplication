package org.example.controller.user;

import org.example.domain.user.User;
import org.example.factory.user.UserFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;



import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class UserControllerTest {

    private static final String BASE_URL="http://localhost:8080/user";

  //  User user= UserFactory.GenericBuilder("30096122","Siphokuhle","Tyasi","0794521278","#3251TG","#TH6852");
    private String studNo ="4783";
    private String fname ="Siphokuhle";
    private String lname ="Tyasi";
    private String cellNo ="0794521278";
    private String cantactId ="#3251TG";
    private String locationId ="#TH6852";

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void create() {
      //      User user= UserFactory.GenericBuilder("30096122","Siphokuhle","Tyasi","0794521278","#3251TG","#TH6852");
//

//    ResponseEntity result =restTemplate.withBasicAuth("admin","password")
//                    .postForEntity(BASE_URL +"/create/",null,String.class);
//
//    System.out.println("this is what you printing "+result.getStatusCode());
//    assertEquals(HttpStatus.OK,result.getStatusCode());


//        User user= UserFactory.GenericBuilder("215048243","cj","Goat","0794521278","#3251TG");
//        System.out.print(user+"/");
//        ResponseEntity<User>  postResponse =restTemplate.postForEntity(BASE_URL +"/create",user,User.class);
//        System.out.println(postResponse);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void update() {
    }

    @Ignore
    public void delete() {
    }

    @Ignore
    public void read() {
    }

    @Test
    public void getAll(){
        ResponseEntity<String> result =restTemplate.withBasicAuth("student","password")
                                .getForEntity(BASE_URL+"/read/all",String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK,result.getStatusCode());
    }


    @Test
    public void testgetAlluser() {
       HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity =new HttpEntity<String>(null,headers);
        ResponseEntity<String> reponse =restTemplate.exchange(BASE_URL +"/read/all",
                HttpMethod.GET,entity,String.class);
        System.out.println(reponse);
        assertNotNull(reponse.getBody());
    }
}