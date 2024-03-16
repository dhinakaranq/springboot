package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.entity.Course;
import com.example.spring.entity.Student;

@Service
public interface ServiceIF {

	Student createAccount(Student student);

	List<Student> getAllAccount();

	Student getById(int id);

	List<Student> getByName(String name);

	List<Course> getCourseFees(double fees);

	Course createAccount(Course course);

}
