
package com.example.spring.controller;

import java.util.List;

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
	
	@PostMapping("/create")
	public Customer createAccounts(@RequestBody Customer customer) {
		return service.createAccount(customer);
	}
	@GetMapping("/getall")
	public List<Customer> getAllAccounts(@RequestParam (value="city",required = false)String cit){
		return service.getAllAccounts(cit);
	}	
	
	@GetMapping("/{id}/get")
	public Customer getById(@PathVariable int id) {
		return service.getByid(id);
	}
	
	@PutMapping("/{id}/update")
	public ResponseEntity<?>updateAccount(@PathVariable int id, @RequestBody Customer customer){
		service.updateAccount(id,customer);
		return ResponseEntity.ok().body("update sucessfully");}
		
	
	@DeleteMapping("/{id}/delete")
	public ResponseEntity<?>deleteAccount(@PathVariable int id){
		service.deleteAccount(id);
		return ResponseEntity.ok().body("delete successfully");
		}
	
}

