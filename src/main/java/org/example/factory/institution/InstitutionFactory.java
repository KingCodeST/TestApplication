package org.example.factory.institution;

import org.example.domain.institution.Institution;

public class InstitutionFactory {

    public static Institution GenericBuilder(String institutionId,String instiName,String instType,String parentType)
    {
        return new Institution.Builder()
                                        .setInstutionId(institutionId)
                                        .setInstitutionName(instiName)
                                        .setInstitutionTypeId(instType)
                                        .setParentInstitutionId(parentType)
                                        .build();
    }


}
