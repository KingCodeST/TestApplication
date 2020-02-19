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
        this.name=builder.name;
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

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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

        public Builder copy(Location location)
        {
            this.locationId =location.locationId;
            this.name=location.name;
            this.latitude=location.latitude;
            this.longitute=location.longitute;
            this.locationType=location.locationType;
            return this;
        }

        public Location build()
        {
            return new Location(this);
        }



    }



}

