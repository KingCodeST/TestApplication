package org.example.factory.institution;

import org.example.domain.institution.Institution;
import org.example.util.GenerateID;

public class InstitutionFactory {

    public static Institution GenericBuilder(String instiName,String instType,String parentType)
    {
        return new Institution.Builder()
                                        .setInstutionId(GenerateID.generateId())
                                        .setInstitutionName(instiName)
                                        .setInstitutionTypeId(instType)
                                        .setParentInstitutionId(parentType)
                                        .build();
    }


}
