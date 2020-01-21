package org.example.service.location.impl;

import org.example.domain.location.Location;
import org.example.repository.location.LocationRepository;
import org.example.service.location.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    private static LocationService locationService= null;

    @Autowired
    private LocationRepository locationRepository;

    private LocationServiceImpl(){}

    public static LocationService getLocationService()
    {
        if(locationService ==null) locationService=new LocationServiceImpl();
        return locationService;
    }

    @Override
    public Location retrieveByDesc(String locationDesc) {
        List<Location> locationList=getAll();
        for(Location locationRepository: locationList)
        {
            if(locationRepository.getName().equalsIgnoreCase(locationDesc))
                return locationRepository;
        }
        return null;
    }

    @Override
    public List<Location> getAll() {
        return this.locationRepository.findAll();
    }

    @Override
    public Location create(Location location) {
        return this.locationRepository.save(location);
    }

    @Override
    public Location read(String s) {
        Optional<Location> optionalLocation=this.locationRepository.findById(s);
        return optionalLocation.orElse(null);
    }

    @Override
    public Location update(Location location) {
        return this.locationRepository.save(location);
    }

    @Override
    public void delete(String s) {
    this.locationRepository.deleteById(s);
    }

}
