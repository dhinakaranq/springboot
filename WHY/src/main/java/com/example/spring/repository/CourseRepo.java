package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
