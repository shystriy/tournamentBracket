package ru.home.tournamentbracket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.tournamentbracket.model.Athlete;
import ru.home.tournamentbracket.repository.AthleteRepository;

import java.util.List;

/**
 * Created by shy on 21.09.2018.
 */
@Service
public class AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    public List<Athlete> getAll() {
        return athleteRepository.findAll();
    }

}
