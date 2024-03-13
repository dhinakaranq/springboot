package com.example.StudentMangementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMangementSystem.entity.Student;
import com.example.StudentMangementSystem.service.ServiceIF;

@RestController
@RequestMapping("/student")
public class StuController {
@Autowired
ServiceIF serviceif;
	
@GetMapping("/get")
public List<Student>getAllStudents()
{
	return serviceif.getAllStudent();	
}

@GetMapping("/get/{id}")
public Student getstudent(@PathVariable ("id") Integer Student)
{
	return serviceif.getstudent(Student);
}

@PostMapping
}
