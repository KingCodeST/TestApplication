package org.example.service.institution.impl;

import org.example.domain.institution.Institution;
import org.example.domain.institution.InstitutionType;
import org.example.repository.institution.InstitutionTypeRepository;
import org.example.service.institution.InstititutionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionTypeServiceImpl implements InstititutionTypeService {

    @Autowired
    private InstitutionTypeRepository repository;
    private static InstititutionTypeService service;


    private InstitutionTypeServiceImpl(){}

    public static InstititutionTypeService getInstitutionService(){
        if(service ==null) service=new InstitutionTypeServiceImpl();
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
    public Institution create(Institution institution) {
        return null;
    }

    @Override
    public Institution read(String s) {
        return null;
    }

    @Override
    public Institution update(Institution institution) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
