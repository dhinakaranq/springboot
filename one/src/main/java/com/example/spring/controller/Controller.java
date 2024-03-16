package com.example.spring.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Customer;
import com.example.spring.service.ServiceIF;

@RestController
@RequestMapping("/api")
public class Controller {
 @Autowired
 ServiceIF service;
 
 @PostMapping
 public Customer createAccount(@Valid @RequestBody Customer customer) {
     return service.createAccount(customer);
 }

 @GetMapping ("/get")
 public List<Customer> getAllAccounts(@RequestParam (value="address",required = false) Set<String> add,
		                              @RequestParam (value="gender",required = false) String gen){                         
	 return service.getAllaccounts(add,gen);
 }
 @GetMapping("/{id}")
 public Customer getById(@PathVariable int id) {
     return service.getById(id);
 }

 @PutMapping("/{id}")
 public ResponseEntity<?> updateAccount(@PathVariable int id,@RequestBody Customer customer) {
service.updateAccount(id,customer);
	  return ResponseEntity.ok().body("update sucessfully");
	  
 }
 
 @DeleteMapping("/{id}")
 public ResponseEntity<?> deleteAccount(@PathVariable int id){
	 service .deleteAccount(id);
	 return ResponseEntity.ok().body("delete successfully");
 }
 
 @GetMapping("/raw")
 public List<Customer>getCustomerByRawQuery(@RequestParam(value="address") Set<String>add){
	 return service.getCustomerByRawQuery(add);
 }
 
}
