package org.example.factory.driver;

import org.example.domain.driver.Driver;
import org.example.util.GenerateID;

public class DriverFactory {

    public static Driver builderDriver(double amt,int age,String fname,String lname){

        return new Driver.Builder()
                            .setDriverId(GenerateID.generateId())
                            .setAmount(amt)
                            .setAge(age)
                            .setFname(fname)
                            .setLname(lname)
                            .buid();


    }

}
