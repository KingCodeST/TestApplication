package org.example.service.driver.impl;

import org.example.domain.driver.Arrive;
import org.example.repository.driver.ArriveRepository;
import org.example.service.driver.ArriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArriveServiceImpl implements ArriveService {

    @Autowired
    private ArriveRepository repository;
    private ArriveService service=null;

    private ArriveServiceImpl(){}

    @Override
    public Arrive create(Arrive arrive) {
        return null;
    }

    @Override
    public Arrive read(String s) {
        return null;
    }

    @Override
    public Arrive update(Arrive arrive) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
