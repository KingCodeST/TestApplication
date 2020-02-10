package org.example.controller.driver;

import org.example.domain.driver.Driver;
import org.example.service.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/testapplication/driver")
public class DriverController {

    @Autowired
    private DriverService service;


    @PostMapping("/create")
    @ResponseBody
    public Driver create(Driver driver){
        return service.create(driver);
    }

}
