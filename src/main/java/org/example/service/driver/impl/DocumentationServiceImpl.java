package org.example.service.driver.impl;

import org.example.domain.driver.Documentation;
import org.example.repository.driver.DocumentationRepository;
import org.example.service.driver.DocumentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentationServiceImpl implements DocumentationService {

    @Autowired
    private DocumentationRepository repository;
    private DocumentationService service;

    private DocumentationServiceImpl(){}

    @Override
    public Documentation create(Documentation documentation) {
        return null;
    }

    @Override
    public Documentation read(String s) {
        return null;
    }

    @Override
    public Documentation update(Documentation documentation) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
