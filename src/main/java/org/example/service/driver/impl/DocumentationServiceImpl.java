package org.example.service.driver.impl;

import org.example.domain.driver.Documentation;
import org.example.repository.driver.DocumentationRepository;
import org.example.service.driver.DocumentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentationServiceImpl implements DocumentationService {

    @Autowired
    private DocumentationRepository repository;
    private static DocumentationService service=null;

    private DocumentationServiceImpl(){}

    public static DocumentationService getDocumentationService()
    {
        if(service ==null)service=new DocumentationServiceImpl();
        return service;
    }

    @Override
    public Documentation create(Documentation documentation) {
        return this.repository.save(documentation);
    }

    @Override
    public Documentation read(String s) {
        return null;
    }

    @Override
    public Documentation update(Documentation documentation) {
        return this.repository.save(documentation);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Documentation retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<Documentation> getAll() {
        return this.repository.findAll();
    }
}
