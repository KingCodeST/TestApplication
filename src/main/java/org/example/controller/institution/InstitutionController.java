package org.example.controller.institution;

import org.example.domain.institution.Institution;
import org.example.domain.user.User;
import org.example.factory.institution.InstitutionFactory;
import org.example.service.institution.InstitutionService;
import org.example.service.institution.impl.InstitutionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/testapplication/institution")
public class InstitutionController {

    @Autowired
    InstitutionServiceImpl institutionService;

    Institution institution;

    Institution institution1=InstitutionFactory.GenericBuilder(institution.getInstitutionName(),institution.getParentInstitutionId(),institution.getInstitutionTypeId());

    @PostMapping(value ="/create/{institution}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createInstitution(@PathVariable String institutions,String institutionType,String parentInstitution){
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
            saveInstitution = InstitutionFactory.GenericBuilder(institution.getInstitutionId(),institutionType,parentInstitution);
            saveInstitution =institutionService.create(saveInstitution);
        }

        return ResponseEntity.ok(this);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Institution> getAll()
    {
        return institutionService.getAll();
    }

}
