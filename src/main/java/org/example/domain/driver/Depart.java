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

    public static class Builder{
        private String departId;
        private String locationId;
        private String locationTypeId;
        private LocalDateTime local;


        
    }

}
