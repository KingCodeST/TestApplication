package org.example.domain.driver;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Depart {

    @Id
    private String departId;
    private String locationId;
    private String locationTypeId;
    private LocalDateTime local;

    public Depart (){}

    public Depart(Builder builder){
        this.departId =builder.departId;
        this.local =builder.local;
        this.locationId=builder.locationId;
        this.locationTypeId=builder.locationTypeId;
    }

    public String getDepartId() {
        return departId;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getLocationTypeId() {
        return locationTypeId;
    }

    public LocalDateTime getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "departId='" + departId + '\'' +
                ", locationId='" + locationId + '\'' +
                ", locationTypeId='" + locationTypeId + '\'' +
                ", local=" + local +
                '}';
    }

    public static class Builder{
        private String departId;
        private String locationId;
        private String locationTypeId;
        private LocalDateTime local;

        public Builder setDepart(String depart)
        {
            this.departId =depart;
            return this;
        }

        public Builder setLocationId(String locationId)
        {
            this.locationId =locationId;
            return this;
        }

        public Builder setlocal(LocalDateTime local)
        {
            this.local =local;
            return this;
        }

        public Builder copy(Depart depart)
        {
            this.locationId =depart.locationId;
            this.departId =depart.departId;
                    this.local =depart.local;
                    return this;
        }

        public Depart build()
        {
            return new Depart(this);
        }


    }

}
