package com.example.spring.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Student;

@Service
public interface ServiceIF {

    Student createAccount(Student student);

    List<Student> getAllAccount(Set<String> add,String gen);

    Student getById(int studentId);

    ResponseEntity<?> deleteAccount(int studentId);

    ResponseEntity<?> updateAccount(int studentId, Student student);

	List<Student> rawquery(Student student);

}
