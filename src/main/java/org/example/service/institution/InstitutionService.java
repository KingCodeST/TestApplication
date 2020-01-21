package org.example.service.institution;

import org.example.domain.institution.InstitutionType;
import org.example.domain.user.User;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InstitutionService extends IService<InstitutionType,String> {
    InstitutionType retrieveByDesc(String institutionTyprDesc);
    List<InstitutionType>getAll();
}
