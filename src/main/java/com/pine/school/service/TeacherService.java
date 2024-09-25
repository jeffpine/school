package com.pine.school.service;

import com.pine.school.model.Teacher;
import com.pine.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Optional<Teacher> findTeacherById(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    public void assignStudentGrade(Long teacherId, Long studentId, Double grade) {
        // Lógica para que o professor possa lançar notas
        // Busca o professor, aluno e insere a nota
    }
}
