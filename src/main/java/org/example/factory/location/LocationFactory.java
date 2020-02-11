package org.example.factory.location;


import org.example.domain.location.Location;
import org.example.util.GenerateID;

public class LocationFactory {

    public static Location builderDriver( String name, String latitude, String longitude, String locationtypeId){

        return new Location.Builder()
                .setLocationId(GenerateID.generateId())
                .setName(name)
                .setLatitude(latitude)
                .setLongitute(longitude)
                .setLocationType(locationtypeId)
                .build();


    }


}
