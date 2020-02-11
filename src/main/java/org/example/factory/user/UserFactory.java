package org.example.factory.user;

import org.example.domain.user.User;
import org.example.util.GenerateID;

public class UserFactory {

    public static User GenericBuilder(String fname,String lname,String cellNo,String cantactId,String locationId)
    {
        return new User.Builder()
                        .setStudentNo(GenerateID.generateId())
                        .setFname(fname)
                        .setLname(lname)
                        .setCellNumber(cellNo)
                        .setContactId(cantactId)
                        .setLocationId(locationId)
                        .build();
    }

}
