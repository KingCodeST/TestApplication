package org.example.domain.login;

import javax.persistence.*;

@Entity
public class Login {

    @Id
    private String studentNo;
    private String password;

    public Login(){}

    private Login(Builder builder)
    {
        this.studentNo = builder.studentNo;
        this.password  = builder.password;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "studentNo='" + studentNo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String studentNo;
        private String password;

        public Builder setStudentNo(String studentNo)
        {
            this.studentNo =studentNo;
            return this;
        }

        public Builder setPassword(String password)
        {
            this.password =password;
            return this;
        }

        public Builder copy(Login login)
        {
            this.studentNo =login.studentNo;
            this.password =login.password;
            return this;
        }

        public Login build()
        {
            return new Login(this);
        }



    }
}
