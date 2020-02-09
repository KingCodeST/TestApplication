package org.example.service.user.impl;

import org.example.domain.user.Race;
import org.example.repository.user.RaceRepository;
import org.example.service.user.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {

    private static RaceService raceService= null;

    @Autowired
    private RaceRepository raceRepository;

    public static RaceService getRaceService()
    {
        if(raceService ==null) raceService=new RaceServiceImpl();
        return raceService;
    }

    @Override
    public Race create(Race race) {
        return this.raceRepository.save(race);
    }

    @Override
    public Race read(String s) {
        Optional<Race> optionalRace=this.raceRepository.findById(s);
        return optionalRace.orElse(null);
    }

    @Override
    public Race update(Race race) {
        if(race ==race) {
            race =this.raceRepository.save(race);
        }

        return this.raceRepository.save(race);
    }

    @Override
    public void delete(String s) {
        this.raceRepository.deleteById(s);
    }

    @Override
    public Race retrieveByDesc(String driverDesc) {
        return null;
    }

    @Override
    public List<Race> getAll() {
        return this.raceRepository.findAll();
    }
}
