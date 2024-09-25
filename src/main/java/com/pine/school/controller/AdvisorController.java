package com.pine.school.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advisor")
public class AdvisorController {

    @PostMapping("/evaluate-recovery")
    public String evaluateRecovery() {
        return "Advisor can evaluate and approve/reject students in recovery";
    }
}