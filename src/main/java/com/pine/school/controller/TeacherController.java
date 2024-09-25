package com.pine.school.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @PostMapping("/add-grades")
    public String addGrades() {
        return "Teacher can add grades for students";
    }
}
