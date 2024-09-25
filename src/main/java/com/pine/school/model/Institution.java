package com.pine.school.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    private Administration administration;

    @OneToOne(cascade = CascadeType.ALL)
    private Faculty faculty;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ClassGroup> classes;

    @OneToOne(cascade = CascadeType.ALL)
    private AcademicYear academicYear;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<ClassGroup> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassGroup> classes) {
        this.classes = classes;
    }

    public AcademicYear getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(AcademicYear academicYear) {
        this.academicYear = academicYear;
    }
}
