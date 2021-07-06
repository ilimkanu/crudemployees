package com.example.test.mappers;

import com.example.test.models.dto.EmployeesDto;
import com.example.test.models.entity.Employees;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeesMapper {
    EmployeesMapper INSTANCE = Mappers.getMapper(EmployeesMapper.class);

    Employees toEmployees(EmployeesDto employeesDto);

    EmployeesDto toEmployeesDto(Employees employees);
}
