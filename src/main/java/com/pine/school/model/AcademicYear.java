package com.pine.school.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AcademicYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ExamDate> examDates;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ExamScore> examScores;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Approval> approvals;

    @OneToOne(cascade = CascadeType.ALL)
    private Holidays holidays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ExamDate> getExamDates() {
        return examDates;
    }

    public void setExamDates(List<ExamDate> examDates) {
        this.examDates = examDates;
    }

    public List<ExamScore> getExamScores() {
        return examScores;
    }

    public void setExamScores(List<ExamScore> examScores) {
        this.examScores = examScores;
    }

    public List<Approval> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
    }

    public Holidays getHolidays() {
        return holidays;
    }

    public void setHolidays(Holidays holidays) {
        this.holidays = holidays;
    }
}