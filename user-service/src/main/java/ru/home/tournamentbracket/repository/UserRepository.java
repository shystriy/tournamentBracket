package ru.home.tournamentbracket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.tournamentbracket.model.User;

/**
 * Created by shy on 21.09.2018.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
