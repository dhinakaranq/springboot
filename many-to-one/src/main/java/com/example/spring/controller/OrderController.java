package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.dto.OrderRequest;
import com.example.spring.entity.Customer;
import com.example.spring.service.ServiceIF;

@RestController
@RequestMapping("/customer")
public class OrderController {
 
	@Autowired
private  ServiceIF service;
	
	
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return service.placeOrder(request.getCustomer());
	}
	
	@GetMapping("/getall")
	public List<Customer> getAllOrders(){
		return service.getAllOrders();
	}
	
	
}
