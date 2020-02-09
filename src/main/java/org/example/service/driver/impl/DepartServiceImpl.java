package org.example.service.driver.impl;

import org.example.domain.driver.Depart;
import org.example.repository.driver.DepartRepository;
import org.example.service.driver.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartRepository repository;
    private static DepartService service = null;

    private DepartServiceImpl(){}

    public static DepartService getDepartService()
    {
        if(service ==null) service=new DepartServiceImpl();
        return service;
    }

    @Override
    public Depart create(Depart depart) {
        return this.repository.save(depart);
    }

    @Override
    public Depart read(String s) {
        return null;
    }

    @Override
    public Depart update(Depart depart) {
        return this.repository.save(depart);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Depart retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<Depart> getAll() {
        return this.repository.findAll();
    }
}
