package org.example.service.location;

import org.example.domain.location.Location;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LocationService extends IService<Location,String> {
    Location retrieveByDesc(String locationDesc);
    List<Location> getAll();
}
