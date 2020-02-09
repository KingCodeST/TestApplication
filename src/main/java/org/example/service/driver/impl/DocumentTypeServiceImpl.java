package org.example.service.driver.impl;

import org.example.domain.driver.DocumentType;
import org.example.repository.driver.DocumentTypeRepository;
import org.example.service.driver.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {

    @Autowired
    private DocumentTypeRepository repository;
    private static DocumentTypeService service=null;

    private DocumentTypeServiceImpl(){}

    public static DocumentTypeService getDocumentTypeService()
    {
        if(service ==null) service =new DocumentTypeServiceImpl();
        return service;
    }


    @Override
    public DocumentType create(DocumentType documentType) {
        return this.repository.save(documentType);
    }

    @Override
    public DocumentType read(String s) {
        return null;
    }

    @Override
    public DocumentType update(DocumentType documentType) {
        return this.repository.save(documentType);

    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public DocumentType retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<DocumentType> getAll() {
        return this.repository.findAll();
    }
}
