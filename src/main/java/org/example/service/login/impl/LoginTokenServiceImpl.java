package org.example.service.login.impl;

import org.example.domain.login.LoginToken;
import org.example.repository.login.LoginTokenRepository;
import org.example.service.login.LoginTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginTokenServiceImpl implements LoginTokenService {

    @Autowired
    private static LoginTokenService service;
    private LoginTokenRepository repository;

    private LoginTokenServiceImpl(){}

    public static LoginTokenService getLoginTokenService(){
        if(service ==null)service=new LoginTokenServiceImpl();
        return service;
    }

    @Override
    public LoginToken create(LoginToken loginToken) {
        return null;
    }

    @Override
    public LoginToken read(String s) {
        return null;
    }

    @Override
    public LoginToken update(LoginToken loginToken) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
