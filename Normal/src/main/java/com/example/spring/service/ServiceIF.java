package com.example.spring.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Customer;

@Service
public interface ServiceIF {

	Customer createAccount(Customer customer);

//	List<Customer> getAllAccounts();

	Customer getByid(int id);

	ResponseEntity<?> updateAccount(int id, Customer customer);

	ResponseEntity<?> deleteAccount(int id);

	List<Customer> getAllAccounts(String cit);





}
