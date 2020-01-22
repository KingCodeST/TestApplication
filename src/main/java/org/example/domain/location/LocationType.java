package org.example.domain.location;

import javax.persistence.*;

@Entity
public class LocationType {

    @Id
    private String locationTypeId;
    private String name;
    private String parentLocationtypeId;

    public LocationType(){}

    public LocationType(Builder builder)
    {
        this.locationTypeId=builder.locationTypeId;
        this.name =builder.name;
        this.parentLocationtypeId=builder.parentLocationtypeId;
    }

    public String getLocationTypeId() {
        return locationTypeId;
    }

    public String getName() {
        return name;
    }

    public String getParentLocationtypeId() {
        return parentLocationtypeId;
    }



    public static class Builder{
        private String locationTypeId;
        private String name;
        private String parentLocationtypeId;

        public Builder setLocationTypeId(String locationTypeId)
        {
            this.locationTypeId=locationTypeId;
            return this;
        }

        public Builder setName(String name)
        {
            this.name =name;
            return this;
        }

        public Builder setParentLocationTypeId(String typeId)
        {
            this.parentLocationtypeId=typeId;
            return this;
        }

        public Builder copy(LocationType locationType)
        {
            this.locationTypeId=locationType.locationTypeId;
            this.name=locationType.name;
            this.parentLocationtypeId=locationType.parentLocationtypeId;
            return this;
        }

        public LocationType build()
        {
            return new LocationType(this);
        }

    }
}
