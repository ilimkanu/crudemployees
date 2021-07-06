package com.example.test.mappers;

import com.example.test.models.dto.SalariesDto;
import com.example.test.models.entity.Salaries;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SalariesMapper {
    SalariesMapper INSTANCE = Mappers.getMapper(SalariesMapper.class);

    Salaries toSalaries(SalariesDto salariesDto);

    SalariesDto toSalariesDto(Salaries salaries);
}