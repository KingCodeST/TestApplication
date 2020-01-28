package org.example.controller.location;

import org.example.domain.location.LocationType;
import org.example.service.location.LocationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
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

//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public LocationType delete(@PathVariable String id)
//    {
//    //   this.service.delete(id);
//
//    }








}
