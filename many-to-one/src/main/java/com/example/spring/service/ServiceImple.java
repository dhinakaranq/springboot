package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Customer;
import com.example.spring.repository.CustomerRepo;
import com.example.spring.repository.ProductRepo;

@Service
public class ServiceImple implements ServiceIF {

	@Autowired
	CustomerRepo cRepo;
	
	@Autowired
	ProductRepo pRepo;

	
	@Override
	public Customer placeOrder(Customer customer) {
		return cRepo.save(customer);
	}


	@Override
	public List<Customer> getAllOrders() {
		return cRepo.findAll();
	}
	
	
		
	}

