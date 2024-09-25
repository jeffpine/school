package com.pine.school.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secretary")
public class SecretaryController {

    @PostMapping("/create-schedule")
    public String createExamSchedule() {
        return "Secretary can create exam schedules";
    }

    @PostMapping("/create-classes")
    public String createClasses() {
        return "Secretary can create classes";
    }

    @PostMapping("/register-teachers")
    public String registerTeachers() {
        return "Secretary can register teachers";
    }

    @PostMapping("/register-students")
    public String registerStudents() {
        return "Secretary can register students";
    }
}