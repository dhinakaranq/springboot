package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	List<Student>findByNameContaining(String name);
}
