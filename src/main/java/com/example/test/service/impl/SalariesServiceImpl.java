package com.example.test.service.impl;

import com.example.test.dao.SalariesRepo;
import com.example.test.mappers.SalariesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalariesServiceImpl {
    @Autowired
    private SalariesRepo salariesRepo;
    private SalariesMapper salariesMapper = SalariesMapper.INSTANCE;
}
