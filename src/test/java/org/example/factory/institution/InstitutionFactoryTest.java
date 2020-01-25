package org.example.factory.institution;

import org.example.domain.institution.Institution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
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
    public void genericBuilder() {Institution care= InstitutionFactory.GenericBuilder(institutionId,institutionName,institutionType,parentInstitutionTypeId);
        Assert.assertNotNull(care);
        System.out.print(care);
    }
}