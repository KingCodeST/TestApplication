package org.example.domain.login;

import javax.persistence.*;

@Entity
public class LoginToken {

    @Id
    private String studentNo;
    private String token;

    public LoginToken(){}

    private LoginToken(Builder builder)
    {
        this.studentNo =builder.studentNo;
        this.token =builder.token;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "LoginToken{" +
                "studentNo='" + studentNo + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public static class Builder{
        private String studentNo;
        private String token;

        public Builder setStudentNo(String studentNo)
        {
            this.studentNo =studentNo;
            return this;
        }
        public Builder setToken(String token)
        {
            this.token =token;
            return this;
        }

        public Builder copy(LoginToken loginToken)
        {
            this.studentNo =loginToken.studentNo;
            this.token =loginToken.token;
            return this;
        }

        public LoginToken build()
        {
            return new LoginToken(this);
        }

    }

}
