package ru.home.tournamentbracket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.tournamentbracket.model.User;
import ru.home.tournamentbracket.repository.UserRepository;

import java.util.List;

/**
 * Created by shy on 21.09.2018.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

}
