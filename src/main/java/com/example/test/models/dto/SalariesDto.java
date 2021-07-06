package com.example.test.models.dto;

import com.example.test.models.entity.Employees;
import lombok.Data;

@Data
public class SalariesDto {
    private Long id;
    private int salary;
    private String start_date;
    private String end_date;
    private Employees employees;
}
