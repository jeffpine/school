package com.pine.school.controller;

import com.pine.school.model.RoleName;
import com.pine.school.model.User;
import com.pine.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user, @RequestParam Set<RoleName> roles) {
        return userService.createUser(user, roles);
    }
}