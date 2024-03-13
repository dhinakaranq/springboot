package com.example.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.EmpVO;

public interface EmpRepo extends JpaRepository<EmpVO, Integer> {

}