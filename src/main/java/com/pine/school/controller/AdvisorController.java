package com.pine.school.controller;

import com.pine.school.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advisor")
public class AdvisorController {

    @Autowired
    private AdvisorService advisorService;

    @PostMapping("/evaluate-recovery")
    public void evaluateRecovery(@RequestParam Long studentId, @RequestParam boolean approved) {
        advisorService.evaluateRecovery(studentId, approved);
    }
}