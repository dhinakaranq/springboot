package com.example.spring.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Student;
import com.example.spring.service.ServiceIF;

@RestController
@RequestMapping("/api")
public class Controller {
    
    @Autowired
    ServiceIF service;
    
    @PostMapping
    public Student createAccount (@RequestBody Student student) {
        return service.createAccount(student);
    }
    
    @GetMapping("/get")
    public List<Student> getAllAcount(@RequestParam(value="address",required = false)Set<String> add,
    		                          @RequestParam(value="gender",required = false)String gen){
        return service.getAllAccount(add,gen);
    }
    
    @GetMapping("/{studentId}")
    public Student getByid(@PathVariable int studentId) {
        return service.getById(studentId);
    }
    
    @PutMapping("/{studentId}")
    public ResponseEntity<?> UpdateAccount(@PathVariable int studentId, @RequestBody Student student){
        return service.updateAccount(studentId, student);
    }
    
    @DeleteMapping("/{studentId}")
    public ResponseEntity<?> deleteAccount(@PathVariable int studentId){
        return service.deleteAccount(studentId);
    }

    @GetMapping("/raw")
    	public List<Student> rawquery(@RequestParam Student student){
    		return service.rawquery(student);
    	}
    }

