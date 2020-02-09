package org.example.service.user;

import org.example.domain.driver.Arrive;
import org.example.domain.user.Gender;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GenderService extends IService<Gender,String> {
    Gender retrieveByDesc(String driverDesc);
    List<Gender> getAll();
}
