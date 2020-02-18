package org.example.controller.location;

import org.example.domain.location.Location;
import org.example.factory.location.LocationFactory;
import org.example.service.location.impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationServiceImpl service;



    @PostMapping("/create")
    public RequestEntity<?> create(@RequestBody Location location)
    {
        long id =service.create(location);
        return RequestEntity.ok().body("Location created id"+id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Location> getAll(){
        return service.getAll();
    }

}
