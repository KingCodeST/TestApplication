package org.example.service.user;

import org.example.domain.user.Address;
import org.example.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AddressService extends IService<Address,String> {
    Address retrieveByDesc(String addressDesc);
    List<Address> getAll();
}
