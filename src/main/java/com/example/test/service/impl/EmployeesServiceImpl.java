package com.example.test.service.impl;

import com.example.test.dao.EmployeesRepo;
import com.example.test.mappers.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl {
    @Autowired
    private EmployeesRepo employeesRepo;

    private EmployeesMapper employeesMapper = EmployeesMapper.INSTANCE;
}
