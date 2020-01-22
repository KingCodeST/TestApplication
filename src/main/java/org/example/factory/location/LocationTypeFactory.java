package org.example.factory.location;

import org.example.domain.location.Location;
import org.example.domain.location.LocationType;

public class LocationTypeFactory {

    public static LocationType builderDriver(String idNum, String name, String parentLocationType){

        return new LocationType.Builder()
                .setLocationTypeId(idNum)
                .setName(name)
                .setParentLocationTypeId(parentLocationType)
                .build();


    }
    
}
