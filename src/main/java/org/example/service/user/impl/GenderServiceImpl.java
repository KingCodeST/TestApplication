package org.example.service.user.impl;

import org.example.domain.user.Gender;
import org.example.repository.user.GenderRepository;
import org.example.service.user.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenderServiceImpl implements GenderService {

    private static GenderService genderService=null;

    @Autowired
    private GenderRepository genderRepository;

    private GenderServiceImpl(){}

    @Override
    public Gender create(Gender gender) {

        return this.genderRepository.save(gender);
    }

    @Override
    public Gender read(String s) {
        Optional<Gender> optionalGender=this.genderRepository.findById(s);
        return optionalGender.orElse(null);
    }

    @Override
    public Gender update(Gender gender) {
        return this.genderRepository.save(gender);
    }

    @Override
    public void delete(String s) {
        this.genderRepository.deleteById(s);
    }
}
