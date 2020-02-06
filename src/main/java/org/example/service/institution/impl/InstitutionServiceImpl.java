package org.example.service.institution.impl;

import org.example.domain.institution.Institution;
import org.example.repository.institution.InstitutionRepository;
import org.example.service.institution.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    private static InstitutionService service;
    private InstitutionRepository repository;

    private InstitutionServiceImpl(){}

    public static InstitutionService getInstitutionService(){
        if(service ==null) service=new InstitutionServiceImpl();
        return service;
    }


    @Override
    public Institution retrieveByDesc(String institutionDesc) {
        return null;
    }

    @Override
    public List<Institution> getAll() {
        return null;
    }

    @Override
    public Institution create(Institution Institution) {
        return null;
    }

    @Override
    public Institution read(String s) {
        return null;
    }

    @Override
    public Institution update(Institution Institution) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
