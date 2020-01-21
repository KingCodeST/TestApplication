package org.example.domain.login;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Changepassword {

    @Id
    private String studentNo;
    private String oldPassword;
    private String newPassword;
    private LocalDateTime datetimeChanged;

    public Changepassword(){}

    private Changepassword(Builder builder)
    {
        this.studentNo =builder.studentNo;
        this.oldPassword =builder.oldPassword;
        this.newPassword =builder.newPassword;
        this.datetimeChanged =builder.datetimeChanged;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public LocalDateTime getDatetimeChanged() {
        return datetimeChanged;
    }

    @Override
    public String toString() {
        return "Changepassword{" +
                "studentNo='" + studentNo + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", datetimeChanged=" + datetimeChanged +
                '}';
    }

    public static class Builder{

        private String studentNo;
        private String oldPassword;
        private String newPassword;
        private LocalDateTime datetimeChanged;

        public Builder setStudentNo(String studentNo)
        {
            this.studentNo =studentNo;
            return this;
        }
        public Builder setOldPassword(String oldPassword)
        {
            this.oldPassword =oldPassword;
            return this;
        }

        public Builder setNewPassword(String newPassword)
        {
            this.newPassword =newPassword;
            return this;
        }

        public Builder setDateTimeChanged(LocalDateTime dateTimeChanged)
        {
            this.datetimeChanged =dateTimeChanged;
            return this;
        }

        public Builder copy(Changepassword changepassword)
        {
            this.studentNo =changepassword.studentNo;
            this.oldPassword =changepassword.oldPassword;
            this.newPassword =changepassword.newPassword;
            this.datetimeChanged =changepassword.datetimeChanged;
            return this;
        }

        public Changepassword build()
        {
            return new Changepassword(this);
        }

    }


}
