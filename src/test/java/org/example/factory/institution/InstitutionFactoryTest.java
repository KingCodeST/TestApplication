package org.example.factory.institution;

import org.example.domain.institution.Institution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstitutionFactoryTest {

  private  Institution city,care;



    private String institutionId= "#2020$";
    private String institutionName ="Catsville";
    private String institutionType ="#8956521";
    private String parentInstitutionTypeId ="#P645689";

    @Before
    public void setUp() throws Exception {

        String institutionId= "#2020$";
        String institutionName ="Catsville";
        String institutionType ="#8956521";
        String parentInstitutionTypeId ="#P645689";
        city= new Institution();


    }

    @Test
    public void genericBuilder() {
//        Institution copy=new Institution(institutionId,institutionName,institutionType,parentInstitutionTypeId);
//        Institution copye=new Institution.Builder(institutionId,institutionName,institutionType,parentInstitutionTypeId);
        Institution care= InstitutionFactory.GenericBuilder(institutionId,institutionName,institutionType,parentInstitutionTypeId);
        Assert.assertNotNull(care);
        System.out.print(care);
    }
}