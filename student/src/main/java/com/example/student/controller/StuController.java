package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.StuVO;
import com.example.student.service.ServiceIF;

@RestController
@RequestMapping("/student")
public class StuController {
@Autowired
ServiceIF serviceif;

@PostMapping("/create")
public StuVO createStudent(@RequestBody StuVO stuVO)
{
	return serviceif.createStudent(stuVO);
}

@GetMapping("/getall")
public List<StuVO> getAllBook()
{
	return serviceif.getAllBook();
}

@GetMapping("/get/{id}")
public StuVO getStudentById(@PathVariable("id") Integer stuVOId)
{
	return serviceif.getStudentId(stuVOId);
}
@PutMapping("/update")
public StuVO updateStudent(@RequestBody StuVO stuVO)
{
	
    return serviceif.save(stuVO);
}
@DeleteMapping("/delete/{Id}")
public void deleteStuBYid(@PathVariable Integer stuVOId)
{
	serviceif.deleteStuById(stuVOId);
}

}
