package org.example.controller.location;

import org.example.domain.location.Location;
import org.example.factory.location.LocationFactory;
import org.example.service.location.impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/testapplication/location")
public class LocationController {

    @Autowired
    private LocationServiceImpl service;

    @GetMapping("/create/{locationNum,LocationName,latitude,longitude,locationTypeId}")
    public @ResponseBody
    Location create(@PathVariable String LocationName,String locationNum,String latitude,String longitude,String locationTypeId ){
        Location location= LocationFactory.builderDriver(locationNum,LocationName,latitude,longitude,locationTypeId);
        return service.create(location);
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Location> getAll(){
        return service.getAll();
    }

}
