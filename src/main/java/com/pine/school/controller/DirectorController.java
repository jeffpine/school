package com.pine.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @GetMapping("/manage")
    public String manageInstitution() {
        return "Director has access to manage the institution";
    }
}