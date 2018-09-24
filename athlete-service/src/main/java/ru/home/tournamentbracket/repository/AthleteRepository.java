package ru.home.tournamentbracket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.tournamentbracket.model.Athlete;

/**
 * Created by shy on 21.09.2018.
 */
public interface AthleteRepository extends JpaRepository<Athlete, Long> {
}
