package org.example.service.user.impl;

import org.example.domain.user.Title;
import org.example.repository.user.TitleRepository;
import org.example.service.user.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TitleServiceImpl implements TitleService {

    private static TitleService titleService= null;

    @Autowired
    private TitleRepository titleRepository;

    private TitleServiceImpl(){}

    public static TitleService getTitleService()
    {
        if(titleService ==null) titleService =new TitleServiceImpl();
        return titleService;
    }

    @Override
    public Title create(Title title) {
        return this.titleRepository.save(title);
    }

    @Override
    public Title read(String s) {
        Optional<Title> optionalTitle =this.titleRepository.findById(s);
        return optionalTitle.orElse(null);
    }

    @Override
    public Title update(Title title) {
        return this.titleRepository.save(title);
    }

    @Override
    public void delete(String s) {
        this.titleRepository.deleteById(s);
    }

    @Override
    public Title retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<Title> getAll() {
        return this.titleRepository.findAll();
    }
}
