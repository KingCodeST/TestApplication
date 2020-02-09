package org.example.service.user;

import org.example.domain.driver.Arrive;
import org.example.domain.user.Race;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RaceService extends IService<Race,String> {
    Race retrieveByDesc(String driverDesc);
    List<Race> getAll();
}
