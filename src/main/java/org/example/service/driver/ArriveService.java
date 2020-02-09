package org.example.service.driver;

import org.example.domain.driver.Arrive;
import org.example.domain.driver.Driver;
import org.example.service.IService;

import java.util.List;

public interface ArriveService extends IService<Arrive,String> {
    Arrive retrieveByDesc(String driverDesc);
    List<Arrive> getAll();
}
