package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	List<Customer> findAllByCity(String cit);

	
}