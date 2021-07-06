package com.example.test.dao;

import com.example.test.models.entity.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalariesRepo extends JpaRepository<Salaries, Long> {
}
