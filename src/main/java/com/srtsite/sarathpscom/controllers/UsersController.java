package com.srtsite.sarathpscom.controllers;

import com.srtsite.sarathpscom.models.Users;
import com.srtsite.sarathpscom.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<Users> list() {
        return userRepository.findAll();

    }

    @GetMapping
    @RequestMapping("{id}")
    public Users get(@PathVariable String id) {
        return userRepository.getOne(id);

    }

    @PostMapping
    public String create(@RequestBody final Users user) {
        try {
            Users savedUser = userRepository.saveAndFlush(user);
            return savedUser.getUsername();
        } catch (DataAccessException er) {
            return "username or email  exist";
        }

    }
}
