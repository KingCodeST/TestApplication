package org.example.factory.driver;

import org.example.domain.driver.Arrive;
import org.example.util.GenerateID;

import java.time.LocalDateTime;

public class ArriveFactory {

    public static Arrive GenericBuild( String aname, String localionId, LocalDateTime date)
    {
        return new Arrive.Builder()
                         .setArriId(GenerateID.generateId())
                        .setArriName(aname)
                        .setLocationId(localionId)
                        .setDate(date)
                        .build();
    }

}
