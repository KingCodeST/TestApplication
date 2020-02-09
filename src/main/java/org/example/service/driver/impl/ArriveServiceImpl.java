package org.example.service.driver.impl;

import org.example.domain.driver.Arrive;
import org.example.repository.driver.ArriveRepository;
import org.example.service.driver.ArriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArriveServiceImpl implements ArriveService {

    @Autowired
    private ArriveRepository repository;
    private static ArriveService service=null;

    private ArriveServiceImpl(){}

    public static ArriveService getArriveService()
    {
        if(service ==null) service=new ArriveServiceImpl();
        return service;
    }

    @Override
    public Arrive create(Arrive arrive) {
        return this.repository.save(arrive);

    }

    @Override
    public Arrive read(String s) {
        return null;
    }

    @Override
    public Arrive update(Arrive arrive) {

        return this.repository.save(arrive);

    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);

    }

    @Override
    public Arrive retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<Arrive> getAll() {
        return this.repository.findAll();
    }
}
