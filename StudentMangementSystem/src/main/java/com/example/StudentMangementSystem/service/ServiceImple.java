package com.example.StudentMangementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMangementSystem.entity.Student;
import com.example.StudentMangementSystem.repository.StudentRepo;
@Service
public class ServiceImple implements ServiceIF {
@Autowired
StudentRepo stuRepo;
	  
   @Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return stuRepo.findAll();
	}


@Override
public Student getstudent(Integer student) {
	// TODO Auto-generated method stub
	return stuRepo.findById(student).orElse(null);
}

   

}
