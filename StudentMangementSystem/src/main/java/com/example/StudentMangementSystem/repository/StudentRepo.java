package com.example.StudentMangementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentMangementSystem.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
