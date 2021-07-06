package com.example.test.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class Salaries {
    @Id
    private Long id;
    private int salary;
    private String start_date;
    private String end_date;
    @OneToOne
    @JoinColumn(name = "id_employees")
    private Employees employees;
}
