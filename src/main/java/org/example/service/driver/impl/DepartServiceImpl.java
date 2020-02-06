package org.example.service.driver.impl;

import org.example.domain.driver.Depart;
import org.example.repository.driver.DepartRepository;
import org.example.service.driver.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartRepository repository;
    private DepartService service = null;

    private DepartServiceImpl(){}

    @Override
    public Depart create(Depart depart) {
        return null;
    }

    @Override
    public Depart read(String s) {
        return null;
    }

    @Override
    public Depart update(Depart depart) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
