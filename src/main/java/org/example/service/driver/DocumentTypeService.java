package org.example.service.driver;

import org.example.domain.driver.Arrive;
import org.example.domain.driver.DocumentType;
import org.example.service.IService;

import java.util.List;

public interface DocumentTypeService extends IService<DocumentType,String> {
    DocumentType retrieveByDesc(String driverDesc);
    List<DocumentType> getAll();
}
