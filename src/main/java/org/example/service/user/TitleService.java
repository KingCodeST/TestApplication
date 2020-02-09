package org.example.service.user;

import org.example.domain.driver.Arrive;
import org.example.domain.user.Title;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TitleService extends IService<Title,String> {
    Title retrieveByDesc(String driverDesc);
    List<Title> getAll();
}
