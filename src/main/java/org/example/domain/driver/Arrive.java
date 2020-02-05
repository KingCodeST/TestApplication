package org.example.domain.driver;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Arrive {

    @Id
    private String arrivedId;
    private String locationId;
    private String arriName;
    private LocalDateTime date;

    public Arrive(){}
    
    private Arrive(Builder builder){
        this.arrivedId =builder.arrivedId;
        this.locationId =builder.locationId;
        this.date =builder.date;
        this.arriName =builder.arriName;
        this.arrivedId =builder.arrivedId;
    }

    public String getArrivedId() {
        return arrivedId;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getArriName() {
        return arriName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Arrive{" +
                "arrivedId='" + arrivedId + '\'' +
                ", locationId='" + locationId + '\'' +
                ", arriName='" + arriName + '\'' +
                ", date=" + date +
                '}';
    }
    
    public static class Builder{
        private String arrivedId;
        private String locationId;
        private String arriName;
        private LocalDateTime date;

        public Builder setArriId(String arrive)
        {
            this.arrivedId =arrive;
            return this;
        }
        
        public Builder setLocationId(String locationId)
        {
            this.locationId =locationId;
            return this;
        }
        
        public  Builder setArriName(String arriName)
        {
            this.arriName =arriName;
            return this;
        }
        
        public Builder setDate(LocalDateTime date)
        {
            this.date =date;
            return this;
        }
        
        public Builder copy(Arrive arrive)
        {
            this.arrivedId =arrive.arrivedId;
            this.arriName =arrive.arriName;
            this.arrivedId =arrive.arrivedId;
            return this;
        }
        
        public Arrive build()
        {
            return new Arrive(this);
        }
        
        
        
    }
}
