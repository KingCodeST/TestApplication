package org.example.factory.user;

import org.example.domain.user.User;

public class UserFactory {

    public static User GenericBuilder(String studNo,String fname,String lname,String cellNo,String cantactId,String locationId)
    {
        return new User.Builder()
                        .setStudentNo(studNo)
                        .setFname(fname)
                        .setLname(lname)
                        .setCellNumber(cellNo)
                        .setContactId(cantactId)
                        .setLocationId(locationId)
                        .build();
    }

}
