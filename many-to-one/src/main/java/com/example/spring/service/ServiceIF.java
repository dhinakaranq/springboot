package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.entity.Customer;

@Service
public interface ServiceIF {

	

	Customer placeOrder(Customer customer);

	List<Customer> getAllOrders();

	Customer getById(int id,Customer customer);

}
