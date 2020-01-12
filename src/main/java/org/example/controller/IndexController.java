package org.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

        @RequestMapping(value ={"/","/testapplication"})
        public ResponseEntity<String> home()
        {
            return new ResponseEntity<>("Welcome to Test Application!", HttpStatus.OK);
        }

}
