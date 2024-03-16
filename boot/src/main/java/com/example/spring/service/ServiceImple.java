package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Course;
import com.example.spring.entity.Student;
import com.example.spring.repository.CourseRepo;
import com.example.spring.repository.StudentRepo;

@Service
public class ServiceImple implements ServiceIF {

	@Autowired
	StudentRepo sRepo;
	
	@Autowired
	CourseRepo cRepo;

	@Override
	public Student createAccount(Student student) {
    return sRepo.save(student);
  
	}

	@Override
	public List<Student> getAllAccount() {
		return sRepo.findAll();
	}

	@Override
	public Student getById(int id) {
		return sRepo.findById(id).orElse(null);
	}

	@Override
	public List<Student> getByName(String name) {
		return sRepo.findByNameContaining(name);
	}

	@Override
	public List<Course> getCourseFees(double fees) {
		return  cRepo.findByFeesLessThan(fees);
	}
	
	
}
