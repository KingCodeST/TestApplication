package org.example.controller.institution;

import org.example.domain.institution.Institution;
import org.example.factory.institution.InstitutionFactory;
import org.example.service.institution.InstitutionService;
import org.example.service.institution.impl.InstitutionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/testapplication/institution")
public class InstitutionController {

    @Autowired
    InstitutionServiceImpl institutionService;

    @PostMapping(value ="/create/{institution}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createInstitution(@PathVariable String institutions,String institutionId,String institutionType,String parentInstitution){
        System.out.println("Enter Value: "+institutions);

        Institution saveInstitution =null;
        if(institutions ==null || institutions.trim().isEmpty()||institutions.equalsIgnoreCase("null")){
            System.out.println("provide a institution");
        }else
        {
            saveInstitution = institutionService.retrieveByDesc(institutions);

        }if (saveInstitution !=null)
        {
            System.out.println("institution already exists");
        }else{
            saveInstitution = InstitutionFactory.GenericBuilder(institutionId,institutions,institutionType,parentInstitution);
            saveInstitution =institutionService.create(saveInstitution);
        }

        return ResponseEntity.ok(this);
    }

}
