package org.example.service.driver;

import org.example.domain.driver.Arrive;
import org.example.domain.driver.Documentation;
import org.example.service.IService;

import java.util.List;

public interface DocumentationService extends IService<Documentation,String> {
    Documentation retrieveByDesc(String driverDesc);
    List<Documentation> getAll();
}
