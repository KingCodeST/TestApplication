package org.example.service.driver;

import org.example.domain.driver.Arrive;
import org.example.domain.driver.Depart;
import org.example.service.IService;

import java.util.List;

public interface DepartService extends IService<Depart,String> {
    Depart retrieveByDesc(String driverDesc);
    List<Depart> getAll();
}
