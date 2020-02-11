package org.example.service.location;

import org.example.domain.location.Location;
import org.example.domain.location.LocationType;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LocationTypeService extends IService<LocationType,String> {
    LocationType retrieveByDesc(String locationTypeDesc);
    List<LocationType> getAll();
}
