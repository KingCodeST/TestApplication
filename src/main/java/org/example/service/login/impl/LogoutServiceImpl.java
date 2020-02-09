package org.example.service.login.impl;

import org.example.domain.login.Logout;
import org.example.repository.login.LogoutRepository;
import org.example.service.login.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogoutServiceImpl implements LogoutService {

    @Autowired
    private static LogoutServiceImpl service;
    private LogoutRepository repository;

    private LogoutServiceImpl(){}

    public static LogoutService getLogoutService()
    {
        if(service ==null) service=new LogoutServiceImpl();
        return service;
    }


    @Override
    public Logout create(Logout logout) {
        return null;
    }

    @Override
    public Logout read(String s) {
        return null;
    }

    @Override
    public Logout update(Logout logout) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
