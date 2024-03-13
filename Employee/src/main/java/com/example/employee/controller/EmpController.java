package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.EmpVO;
import com.example.employee.service.EmpIf;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	EmpIf empIf;
	
	
	@PostMapping("/emp")
	public EmpVO createEmp(@RequestBody EmpVO empVO)
	{
		
		return empIf.createEmp(empVO);
	}
	
	@GetMapping("/emp")
    public List<EmpVO> getAllEmps() 
	{
		
        return empIf.getAllEmps();
    }
}