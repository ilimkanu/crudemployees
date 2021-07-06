package com.example.test.models.dto;

import lombok.Data;

@Data
public class EmployeesDto {
    private Long id;
    private String name;
    private String surname;
    private boolean active;
}
