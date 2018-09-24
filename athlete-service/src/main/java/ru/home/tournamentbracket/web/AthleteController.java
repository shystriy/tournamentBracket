package ru.home.tournamentbracket.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.home.tournamentbracket.model.Athlete;
import ru.home.tournamentbracket.service.AthleteService;

import java.util.List;

/**
 * Created by shy on 11.06.2018.
 */

@RestController
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @GetMapping("/")
    public List<Athlete> athletes() {
        return athleteService.getAll();
    }
}
