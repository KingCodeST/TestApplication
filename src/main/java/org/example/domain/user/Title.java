package org.example.domain.user;

import javax.persistence.*;

@Entity
public class Title {

    @Id
    private String studentNo;
    private String titleId;
    private String name;

    public Title(){}

    private Title(Builder builder)
    {
        this.studentNo =builder.studentNo;
        this.titleId=builder.titleId;
        this.name=builder.name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getTitleId() {
        return titleId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Title{" +
                "studentNo='" + studentNo + '\'' +
                ", titleId='" + titleId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private String studentNo;
        private String titleId;
        private String name;

        public Builder setStudentNo(String studentNo)
        {
            this.studentNo =studentNo;
            return this;
        }

        public Builder setTitleId(String titleId)
        {
            this.titleId =titleId;
            return this;
        }

        public Builder setName(String name)
        {
            this.name =name;
            return this;
        }

        public Builder copy(Title title){
            this.studentNo=title.studentNo;
            this.name=title.name;
            this.titleId=title.titleId;
            return this;
        }

        public Title build()
        {
            return new Title(this);
        }

    }


}
