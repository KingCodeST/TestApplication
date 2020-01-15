package org.example.domain.location;

import javax.persistence.*;

@Entity
public class Location {

    @Id
    private String locationId;
    private String name;
    private String locationType;
    private String longitute;
    private String latitude;

    public Location(){}

    private Location(Builder builder)
    {
        this.locationId=builder.locationId;
        this.name=this.name;
        this.locationType=builder.locationType;
        this.longitute=builder.longitute;
        this.latitude=builder.latitude;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getName() {
        return name;
    }

    public String getLocationType() {
        return locationType;
    }

    public String getLongitute() {
        return longitute;
    }

    public String getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId='" + locationId + '\'' +
                ", name='" + name + '\'' +
                ", locationType='" + locationType + '\'' +
                ", longitute='" + longitute + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }

    public static class Builder{
        private String locationId;
        private String name;
        private String locationType;
        private String longitute;
        private String latitude;

        public Builder setLocationId(String locationId)
        {
            this.locationId = locationId;
            return this;
        }

        public Builder setName(String name)
            {
                this.name =name;
                return this;
            }

        public Builder setLocationType(String locationType)
        {
            this.locationType=locationType;
            return this;
        }

        public Builder setLongitute(String longitute)
        {
            this.longitute =longitute;
            return this;
        }

        public Builder setLatitude(String latitude)
        {
            this.latitude=latitude;
            return this;
        }



    }



}

