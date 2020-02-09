package org.example.factory.driver;

import org.example.domain.driver.Arrive;

import java.time.LocalDateTime;

public class ArriveFactory {

    public static Arrive GenericBuild(String arrive, String aname, String localionId, LocalDateTime date)
    {
        return new Arrive.Builder()
                         .setArriId(arrive)
                        .setArriName(aname)
                        .setLocationId(localionId)
                        .setDate(date)
                        .build();
    }

}
