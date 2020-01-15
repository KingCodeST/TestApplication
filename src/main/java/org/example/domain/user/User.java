package org.example.domain.user;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class User {

    @Id
    private String studentNo;
    private String addressId;
    private String contactId;
    private String cellNumber;
    private String locationId;

    public User (){}

    public User(Builder builder)
    {
        this.studentNo =builder.studentNo;
        this.addressId =builder.addressId;
        this.locationId=builder.locationId;
        this.contactId=builder.contactId;
        this.cellNumber=builder.cellNumber;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getContactId() {
        return contactId;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getLocationId() {
        return locationId;
    }

    @Override
    public String toString() {
        return "User{" +
                "studentNo='" + studentNo + '\'' +
                ", addressId='" + addressId + '\'' +
                ", contactId='" + contactId + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }

    public static class Builder{
        private String studentNo;
        private String addressId;
        private String contactId;
        private String cellNumber;
        private String locationId;

        public Builder setStudentNo(String studentNo){
            this.studentNo=studentNo;
            return this;
        }
        private Builder setAddressId(String addressId)
        {
            this.addressId =addressId;
            return this;
        }

        public Builder setContactId(String contactId)
        {
            this.contactId =contactId;
            return this;
        }

        public Builder setCellNumber(String cellNumber)
        {
            this.cellNumber =cellNumber;
            return this;
        }

        public Builder setLocationId(String locationId)
        {
            this.locationId =locationId;
            return this;
        }

        public Builder copy(User user)
        {
            this.studentNo =user.studentNo;
            this.locationId=user.locationId;
            this.cellNumber=user.cellNumber;
            this.contactId=user.contactId;
            this.addressId=user.addressId;
            return this;
        }

        public User build()
        {
            return new User(this);
        }



    }

}
