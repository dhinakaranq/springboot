package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Course;
import com.example.spring.entity.Student;
import com.example.spring.service.ServiceIF;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	ServiceIF service;
	
	@PostMapping
	 public ResponseEntity<Course> createAccount(@RequestBody Course course) {
        Course createdCourse = service.createAccount(course);
        return ResponseEntity.ok(createdCourse);
    }
	@GetMapping
	public List<Student> getAllAccount(){
		return service.getAllAccount();
	} 
	
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
    	return service.getById(id);
    }
    
    @GetMapping("/{name}")
    public List<Student>getByName(@PathVariable String name){
    	return  service.getByName(name);
    }
    
    @GetMapping("/{fees}")
    public List<Course>getCourseFees(@PathVariable double fees)
    {
    	return service.getCourseFees(fees);
    }
    
    
    
}
