package org.example.factory.institution;

import org.example.domain.institution.Institution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstitutionFactoryTest {

    Institution city;

    @Before
    public void setUp() throws Exception {

        city= new Institution();
    }

    @Test
    public void genericBuilder() {

    }
}