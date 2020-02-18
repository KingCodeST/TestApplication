package org.example.controller;

import org.example.controller.driver.DriverController;
import org.example.controller.institution.InstitutionController;
import org.example.controller.location.LocationController;
import org.example.controller.location.LocationTypeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {

    private static HttpServletRequest request;

        @RequestMapping(value ={"/","/testapplication"})
        public ResponseEntity<String> home()
        {
            return new ResponseEntity<>("Welcome to Test Application!", HttpStatus.OK);
        }





    String value=null;
    @Autowired
    DriverController controller;

    @Autowired
    InstitutionController institutionController;
    @Autowired
    LocationController  locationController;
    @Autowired
    LocationTypeController locationTypeController;





}
