package org.example.service.location.impl;

import org.example.domain.location.Location;
import org.example.domain.location.LocationType;
import org.example.repository.location.LocationTypeRepository;
import org.example.service.location.LocationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationTypeServiceImpl implements LocationTypeService {



    @Autowired
    private LocationTypeRepository locationTypeRepository;
    private static LocationTypeService locationTypeService= null;


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

    @Override
    public LocationType retrieveByDesc(String locationTypeDesc) {
        return null;
    }

    @Override
    public List<LocationType> getAll() {
        return locationTypeRepository.findAll();
    }
}
