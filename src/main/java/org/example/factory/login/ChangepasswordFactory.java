package org.example.factory.login;

import org.example.domain.login.Changepassword;


import java.time.LocalDateTime;
public class ChangepasswordFactory {


    public static Changepassword GenericBuilder(String studentNo,String oldpass,String newPassword,LocalDateTime changed)
    {
        return new Changepassword.Builder()
                                .setStudentNo(studentNo)
                                .setOldPassword(oldpass)
                                .setNewPassword(newPassword)
                                .setDateTimeChanged(changed)
                                .build();
    }




}
