package org.example.service.user.impl;

import org.example.domain.user.Address;
import org.example.repository.user.AddressRepository;
import org.example.service.user.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private static AddressService addressService=null;

    @Autowired
    private AddressRepository addressRepository;

    private AddressServiceImpl(){}

    public static AddressService getAddressService(){
        if(addressService ==null) addressService =new AddressServiceImpl();
        return addressService;
    }

    public  Address retrieveByDesc(String addressDesc)
    {
        List<Address> addresses=getAll();
        for(Address addressRepository: addresses)
        {
            if(addressRepository.getAddressId().equalsIgnoreCase(addressDesc))
                return addressRepository;
        }
        return null;
    }

    @Override
    public List<Address> getAll() {
        return this.addressRepository.findAll();
    }

    @Override
    public Address create(Address address) {

        return this.addressRepository.save(address);
    }

    @Override
    public Address read(String s) {
        Optional<Address> optAddress=this.addressRepository.findById(s);
        return optAddress.orElse(null);
    }

    @Override
    public Address update(Address address) {
        return this.addressRepository.save(address);
    }

    @Override
    public void delete(String s) {
        this.addressRepository.deleteById(s);
    }
}
