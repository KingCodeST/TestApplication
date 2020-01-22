package org.example.service.driver.impl;

import org.example.domain.driver.Driver;
import org.example.repository.driver.DriverRepository;
import org.example.service.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    private static DriverService driverService= null;

    @Autowired
    private DriverRepository driverRepository;

    private DriverServiceImpl(){

    }

    public static DriverService getDriverService()
    {
        if(driverService ==null) driverService=new DriverServiceImpl();
        return driverService;
    }

    public Driver retrieveByDesc(String driverDesc)
    {
        List<Driver> drivers =getAll();
        for(Driver driverRepository: drivers)
        {
            if(driverRepository.getFname().equalsIgnoreCase(driverDesc))
                return driverRepository;
        }
        return null;
    }

    @Override
    public Driver create(Driver driver) {
        return this.driverRepository.save(driver);
    }

    @Override
    public Driver read(String s) {
        Optional<Driver> optionalDriver=this.driverRepository.findById(s);
        return optionalDriver.orElse(null);
    }

    @Override
    public Driver update(Driver driver) {
        return this.driverRepository.save(driver);
    }

    @Override
    public void delete(String s) {
        this.driverRepository.deleteById(s);

    }

    @Override
    public List<Driver> getAll() {
        return this.driverRepository.findAll();
    }
}
