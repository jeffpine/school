package com.pine.school.service;

import com.pine.school.model.Student;
import com.pine.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdvisorService {

    @Autowired
    private StudentRepository studentRepository;

    public void evaluateRecovery(Long studentId, boolean approved) {
        Optional<Student> student = studentRepository.findById(studentId);

        if (student.isPresent()) {
            // Lógica para aprovar ou reprovar o aluno na recuperação
            Student updatedStudent = student.get();
            updatedStudent.setRecoveryApproved(approved);
            studentRepository.save(updatedStudent);
        }
    }
}
