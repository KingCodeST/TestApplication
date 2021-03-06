package org.example.service.institution.impl;

import org.example.domain.institution.Institution;
import org.example.repository.institution.InstitutionRepository;
import org.example.service.institution.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    private static InstitutionService service ;

    @Autowired
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
        return repository.findAll();
    }

    @Override
    public Institution create(Institution institution) {
        return this.repository.save(institution);
    }

    @Override
    public Institution read(String s) {
        return null;
    }

    @Override
    public Institution update(Institution institution) {
        return this.repository.save(institution);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }
}
