package com.example.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.EmpVO;

@Service
public interface EmpIf {



	EmpVO createEmp(EmpVO empVO);

	List<EmpVO> getAllEmps();

}
