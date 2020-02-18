package org.example.factory.location;

import org.example.domain.location.Location;
import org.example.domain.location.LocationType;
import org.example.util.GenerateID;

public class LocationTypeFactory {

    public static LocationType builderDriver( String name, String parentLocationType){

        return new LocationType.Builder()
                                .setLocationTypeId(GenerateID.generateId())
                                .setName(name)
                                .setParentLocationTypeId(parentLocationType)
                                .build();


    }
    
}
