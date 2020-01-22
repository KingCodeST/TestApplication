package org.example.domain.institution;

import javax.persistence.*;

@Entity
public class Institution {

    @Id
    private String institutionId;
    private String institutionName;
    private String institutionTypeId;
    private String parentInstitutionId;

    public Institution(){}

    private Institution(Builder builder){
        this.institutionId =builder.institutionId;
        this.institutionName=builder.institutionName;
        this.institutionTypeId=builder.institutionTypeId;
        this.parentInstitutionId=builder.parentInstitutionId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getInstitutionTypeId() {
        return institutionTypeId;
    }

    public String getParentInstitutionId() {
        return parentInstitutionId;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "institutionId='" + institutionId + '\'' +
                ", institutionName='" + institutionName + '\'' +
                ", institutionTypeId='" + institutionTypeId + '\'' +
                ", parentInstitutionId='" + parentInstitutionId + '\'' +
                '}';
    }

    public static class Builder{

        private String institutionId;
        private String institutionName;
        private String institutionTypeId;
        private String parentInstitutionId;

        public Builder setInstutionId(String institutionId)
        {
            this.institutionId =institutionId;
            return this;
        }

        public Builder setInstitutionName(String institutionName)
        {
            this.institutionName =institutionName;
            return this;
        }

        public Builder setInstitutionTypeId(String institutionTypeId)
        {
            this.institutionTypeId =institutionTypeId;
            return this;
        }

        public Builder setParentInstitutionId(String parentInstitutionId)
        {
            this.parentInstitutionId =parentInstitutionId;
            return this;
        }

        public Builder copy(Institution institution)
        {
            this.institutionId=institution.institutionId;
            this.institutionName=institution.institutionName;
            this.institutionTypeId=institution.institutionTypeId;
            this.parentInstitutionId=institution.parentInstitutionId;
            return this;
        }

        public Institution build()
        {
            return new Institution(this);
        }

    }

}
