package org.example.service.login.impl;

import org.example.domain.login.Login;
import org.example.repository.login.LoginRepository;
import org.example.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private static LoginService service;
    private LoginRepository repository;

    private LoginServiceImpl(){}

    public static LoginService getLoginService()
    {
        if(service ==null) service=new LoginServiceImpl();
        return service;
    }

    @Override
    public Login create(Login login) {
        return null;
    }

    @Override
    public Login read(String s) {
        return null;
    }

    @Override
    public Login update(Login login) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
