package org.example.domain.institution;

import javax.persistence.*;

@Entity
public class InstitutionType {

    @Id
    private String institutionTypeId;
    private String institutionTypeName;
    private String parentInstitutionTypeId;

    public InstitutionType(){}

    private InstitutionType(Builder builder)
    {
        this.institutionTypeId =builder.institutionTypeId;
        this.institutionTypeName = builder.institutionTypeName;
        this.parentInstitutionTypeId= builder.parentInstitutionTypeId;
    }

    public String getInstitutionTypeId() {
        return institutionTypeId;
    }

    public String getInstitutionTypeName() {
        return institutionTypeName;
    }

    public String getParentInstitutionTypeId() {
        return parentInstitutionTypeId;
    }

    @Override
    public String toString() {
        return "InstitutionType{" +
                "institutionTypeId='" + institutionTypeId + '\'' +
                ", institutionTypeName='" + institutionTypeName + '\'' +
                ", parentInstitutionTypeId='" + parentInstitutionTypeId + '\'' +
                '}';
    }

    public static class Builder{
        private String institutionTypeId;
        private String institutionTypeName;
        private String parentInstitutionTypeId;

        public Builder setInstitutionId(String institutionTypeId)
        {
            this.institutionTypeId =institutionTypeId;
            return this;
        }

        public Builder setInstitutionTypeName(String institutionTypeName)
        {
            this.institutionTypeName=institutionTypeName;
            return this;
        }

        public Builder setParentInstitutionTypeId(String parentInstitutionTypeId)
        {
            this.parentInstitutionTypeId=parentInstitutionTypeId;
            return this;
        }

        public Builder copy(InstitutionType institutionType)
        {
            this.institutionTypeId =institutionType.institutionTypeId;
            this.institutionTypeName=institutionType.institutionTypeName;
            this.parentInstitutionTypeId=institutionType.parentInstitutionTypeId;
            return this;
        }

        public InstitutionType build()
        {
            return new InstitutionType(this);
        }

    }

}
