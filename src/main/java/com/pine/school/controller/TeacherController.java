package com.pine.school.controller;

import com.pine.school.model.Teacher;
import com.pine.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/grade-student")
    public void gradeStudent(@RequestParam Long teacherId, @RequestParam Long studentId, @RequestParam Double grade) {
        teacherService.assignStudentGrade(teacherId, studentId, grade);
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable Long id) {
        return teacherService.findTeacherById(id).orElseThrow(() -> new RuntimeException("Teacher not found"));
    }
}