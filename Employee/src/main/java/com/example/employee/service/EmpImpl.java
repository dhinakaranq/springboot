package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmpVO;
import com.example.employee.repo.EmpRepo;

@Service
public class EmpImpl implements EmpIf {
@Autowired
	EmpRepo empRepo;

@Override
public EmpVO createEmp(EmpVO empVO) {
	// TODO Auto-generated method stub
	return empRepo.save(empVO);
}

@Override
public List<EmpVO> getAllEmps() {
	// TODO Auto-generated method stub
	return null;
}


}
