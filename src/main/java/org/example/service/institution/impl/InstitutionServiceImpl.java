package org.example.service.institution.impl;

import org.example.domain.institution.InstitutionType;
import org.example.service.institution.InstitutionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Override
    public InstitutionType retrieveByDesc(String institutionTyprDesc) {
        return null;
    }

    @Override
    public List<InstitutionType> getAll() {
        return null;
    }

    @Override
    public InstitutionType create(InstitutionType institutionType) {
        return null;
    }

    @Override
    public InstitutionType read(String s) {
        return null;
    }

    @Override
    public InstitutionType update(InstitutionType institutionType) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
