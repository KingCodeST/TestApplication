package org.example.domain.user;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    private String addressId;
    private String postal;
    private String currentAddress;

    public Address(){}

    private Address(Builder builder)
    {
        this.addressId=builder.addressId;
        this.postal=builder.postal;
        this.currentAddress=builder.currentAddress;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getPostal() {
        return postal;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }



    public static class Builder{

        private String addressId;
        private String postal;
        private String currentAddress;

        public Builder setAddressId(String addressId)
        {
            this.addressId =addressId;
            return this;
        }

        public Builder setPostal(String postal)
        {
            this.postal =postal;
            return this;
        }

        public Builder setCurrentAddress(String currentAddress)
        {
            this.currentAddress=currentAddress;
            return this;
        }

        public Builder copy(Address address)
        {
            this.addressId=address.addressId;
            this.postal=address.postal;
            this.currentAddress=address.currentAddress;
            return this;
        }

        public Address build()
        {
            return new Address(this);
        }

    }
}
