package org.example.controller.driver;

import org.example.domain.driver.Driver;
import org.example.domain.user.User;
import org.example.factory.driver.DriverFactory;
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

    Driver driver;
    Driver driver1 = DriverFactory.builderDriver(driver.getAmt(),driver.getAge(),driver.getFname(),driver.getLname());

    @PostMapping("/create")
    @ResponseBody
    public Driver create(Driver driver){
        return service.create(driver1);
    }


    @GetMapping("/read/all")
    @ResponseBody
    public List<Driver> getAll()
    {
        return service.getAll();
    }

}
