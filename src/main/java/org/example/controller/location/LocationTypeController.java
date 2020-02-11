package org.example.controller.location;

import org.example.domain.location.LocationType;
import org.example.domain.user.User;
import org.example.service.location.LocationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/locationtype")
public class LocationTypeController {

    @Autowired
    private LocationTypeService service;

    @PostMapping("/create")
    @ResponseBody
    public LocationType create(LocationType locationType)
    {
        return service.create(locationType);
    }

    @PostMapping("/update")
    @ResponseBody
    public LocationType update(LocationType locationType)
    {
        return service.update(locationType);
    }

    @GetMapping("/read{id}")
    @ResponseBody
    public LocationType read(@PathVariable String id)
    {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<LocationType> getAll()
    {
        return service.getAll();
    }

//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public LocationType delete(@PathVariable String id)
//    {
//    //   this.service.delete(id);
//
//    }








}
