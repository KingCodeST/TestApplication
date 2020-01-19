package org.example.factory.location;

import org.example.domain.driver.Driver;
import org.example.domain.location.Location;

public class LocationFactory {

    public static Location builderDriver(String idNum, String name, String latitude, String longitude, String locationtypeId){

        return new Location.Builder()
                .setLocationId(idNum)
                .setName(name)
                .setLatitude(latitude)
                .setLongitute(longitude)
                .setLocationType(locationtypeId)
                .build();


    }


}
