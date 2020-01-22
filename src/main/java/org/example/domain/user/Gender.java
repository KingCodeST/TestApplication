package org.example.domain.user;

import javax.persistence.*;

@Entity
public class Gender {

    @Id
    private String studentNo;
    private String genderId;
    private String genderName;

    public Gender(){}

    private Gender(Builder builder)
    {
        this.studentNo =builder.studentNo;
        this.genderId =builder.genderId;
        this.genderName=builder.genderName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public static class Builder{

        private String studentNo;
        private String genderId;
        private String genderName;

        public Builder setStudentNo(String studentNo)
        {
            this.studentNo =studentNo;
            return this;
        }

    }

}
