package org.example.controller.driver;

import org.example.domain.driver.Driver;
import org.example.domain.user.User;
import org.example.service.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/read/all")
    @ResponseBody
    public List<Driver> getAll()
    {
        return service.getAll();
    }

}
