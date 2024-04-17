package com.example.spring.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Student;
import com.example.spring.repository.CourseRepo;
import com.example.spring.repository.StudentRepo;

@Service
public class ServiceImple implements ServiceIF {
    
    @Autowired
    StudentRepo stuRepo;
    
    @Autowired
    CourseRepo courRepo;
    
    @Override
    public Student createAccount(Student student) {
        return stuRepo.save(student);
    }

    @Override
    public List<Student> getAllAccount(Set<String> add,String gen) {
        if(add!=null) {
        	return stuRepo.findByAddressInAndGender(add,gen);
        }else {
        	return stuRepo.findAll();
        }
    }

    @Override
    public Student getById(int studentId) {
        return stuRepo.findById(studentId).orElse(null);
    }

    @Override
    public ResponseEntity<?> deleteAccount(int studentId) {
        stuRepo.deleteById(studentId);
        return ResponseEntity.ok().body("Delete Successfully!");
    }

    @Override
    public ResponseEntity<?> updateAccount(int studentId, Student student) {
        Student stu = stuRepo.findById(studentId).orElse(null);
        if (stu != null) {
            stu.setStudentName(student.getStudentName());
            stu.setAddress(student.getAddress());
            stu.setGender(student.getGender());
            stu.setOrgId(student.getOrgId());
            stu.setCourses(student.getCourses());
            
            stuRepo.save(stu);
            return ResponseEntity.ok().body("Update Successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@Override
	public List<Student> rawquery(Student student) {
		return stuRepo.findByAddress(student);
	}

}
