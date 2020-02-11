package org.example.factory.institution;

import org.example.domain.institution.InstitutionType;
import org.example.util.GenerateID;

public class InstitutionTypeFactory {

    public static InstitutionType GenericBuilder(String institutionTypeId,String parentInstitutionId)
    {
        return new InstitutionType.Builder()
                                  .setInstitutionId(GenerateID.generateId())
                                  .setInstitutionTypeName(institutionTypeId)
                                    .setParentInstitutionTypeId(parentInstitutionId)
                                    .build();

    }


}
