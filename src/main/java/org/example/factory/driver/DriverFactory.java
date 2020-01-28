package org.example.factory.driver;

import org.example.domain.driver.Driver;

public class DriverFactory {

    public static Driver builderDriver(String idNum,double amt,int age,String fname,String lname){

        return new Driver.Builder()
                            .setDriverId(idNum)
                            .setAmount(amt)
                            .setAge(age)
                            .setFname(fname)
                            .setLname(lname)
                            .buid();


    }

}
