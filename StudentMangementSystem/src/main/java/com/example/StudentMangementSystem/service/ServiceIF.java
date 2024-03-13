package com.example.StudentMangementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.StudentMangementSystem.entity.Student;
@Service
public interface ServiceIF {

	List<Student> getAllStudent();

	

	Student getstudent(Integer student);

}
