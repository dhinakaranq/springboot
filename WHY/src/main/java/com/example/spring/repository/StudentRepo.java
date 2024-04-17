package com.example.spring.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	 @Query(value = "SELECT * FROM Student WHERE address = :address", nativeQuery = true)
	 List<Student> findByAddress(Student student);
	
	
	
	List<Student> findByAddressInAndGender(Set<String> add,String gen);

	

}
