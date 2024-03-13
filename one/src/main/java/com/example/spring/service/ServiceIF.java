package com.example.spring.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Customer;

@Service
public interface ServiceIF {

	Customer createAccount(Customer customer);



	Customer getById(int id);


	ResponseEntity<?> updateAccount(int id, Customer customer);

	ResponseEntity<?> deleteAccount(int id);

	List<Customer> getAllaccounts(Set<String> add,String gen);



	List<Customer> getCustomerByRawQuery(Set<String> add);

}
