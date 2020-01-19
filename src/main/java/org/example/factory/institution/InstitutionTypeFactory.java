package org.example.factory.institution;

import org.example.domain.institution.InstitutionType;

public class InstitutionTypeFactory {

    public static InstitutionType GenericBuilder(String institutionId,String institutionTypeId,String parentInstitutionId)
    {
        return new InstitutionType.Builder()
                                  .setInstitutionId(institutionId)
                                  .setInstitutionTypeName(institutionTypeId)
                                    .setParentInstitutionTypeId(parentInstitutionId)
                                    .build();

    }


}
