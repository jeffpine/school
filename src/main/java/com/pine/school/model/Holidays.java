package com.pine.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Holidays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startHoliday;
    private String endHoliday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartHoliday() {
        return startHoliday;
    }

    public void setStartHoliday(String startHoliday) {
        this.startHoliday = startHoliday;
    }

    public String getEndHoliday() {
        return endHoliday;
    }

    public void setEndHoliday(String endHoliday) {
        this.endHoliday = endHoliday;
    }
}
