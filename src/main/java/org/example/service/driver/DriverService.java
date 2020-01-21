package org.example.service.driver;

import org.example.domain.driver.Driver;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverService extends IService<Driver,String> {
    Driver retrieveByDesc(String driverDesc);
    List<Driver> getAll();
}
