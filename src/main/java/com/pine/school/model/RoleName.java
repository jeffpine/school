package com.pine.school.model;

public enum RoleName {
    ROLE_DIRECTOR,       // Diretor - Privilégio total
    ROLE_SECRETARY,      // Secretário - Gerencia calendário, turmas, professores e alunos
    ROLE_TEACHER, // Professor - Pode lançar notas
    ROLE_ADVISOR,        // Orientador - Avalia alunos em recuperação
    ROLE_STUDENT         // Aluno - Apenas visualização
}
