package com.pine.school.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "class_group_id")
    private ClassGroup classGroup;

    private Boolean recoveryApproved;

    // Construtores, getters e setters

    public Student() {
    }

    public Student(String name, ClassGroup classGroup) {
        this.name = name;
        this.classGroup = classGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassGroup getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(ClassGroup classGroup) {
        this.classGroup = classGroup;
    }

    public Boolean getRecoveryApproved() {
        return recoveryApproved;
    }

    public void setRecoveryApproved(Boolean recoveryApproved) {
        this.recoveryApproved = recoveryApproved;
    }
}