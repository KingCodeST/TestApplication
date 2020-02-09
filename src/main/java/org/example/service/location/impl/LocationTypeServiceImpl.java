package org.example.service.location.impl;

import org.example.domain.location.LocationType;
import org.example.repository.location.LocationTypeRepository;
import org.example.service.location.LocationTypeService;
import org.springframework.stereotype.Service;

@Service
public class LocationTypeServiceImpl implements LocationTypeService {

    private static LocationTypeService locationTypeService= null;
    private LocationTypeRepository locationTypeRepository;

    private LocationTypeServiceImpl()
    {

    }

    public static LocationTypeService getLocationTypeService(){
        if(locationTypeService ==null)locationTypeService=new LocationTypeServiceImpl();
                return locationTypeService;
    }

    @Override
    public LocationType create(LocationType locationType) {

        return locationTypeRepository.save(locationType);
    }

    @Override
    public LocationType read(String s) {
        return locationTypeRepository.getOne(s);
    }

    @Override
    public LocationType update(LocationType locationType) {
        return locationTypeRepository.save(locationType);
    }

    @Override
    public void delete(String s) {
        locationTypeRepository.deleteById(s);
    }
}
