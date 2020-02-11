package org.example.service.user;


import org.example.domain.user.User;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService extends IService<User,String> {
    User retrieveByDesc(String UserDesc);
    List<User> getAll();
}
