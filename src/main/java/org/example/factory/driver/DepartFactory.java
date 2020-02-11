package org.example.factory.driver;

import org.example.domain.driver.Depart;
import org.example.util.GenerateID;

import java.time.LocalDateTime;

public class DepartFactory {

    public static Depart GenericBuild(LocalDateTime date, String localId){
        return new Depart.Builder()
                         .setDepart(GenerateID.generateId())
                         .setlocal(date)
                         .setLocationId(localId)
                         .build();
    }

}
