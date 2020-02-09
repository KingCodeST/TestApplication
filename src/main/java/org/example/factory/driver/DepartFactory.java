package org.example.factory.driver;

import org.example.domain.driver.Depart;

import java.time.LocalDateTime;

public class DepartFactory {

    public static Depart GenericBuild(String depart, LocalDateTime date, String localId){
        return new Depart.Builder()
                         .setDepart(depart)
                         .setlocal(date)
                         .setLocationId(localId)
                         .build();
    }

}
