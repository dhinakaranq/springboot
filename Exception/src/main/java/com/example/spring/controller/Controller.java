package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.dto.AccountDto;
import com.example.spring.entity.Account;
import com.example.spring.service.ServiceIF;
import com.example.spring.thorw.UserNotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/account")
public class Controller {
	@Autowired
	ServiceIF service;
	
	@PostMapping("/create")
	public ResponseEntity<Account> createAccount(@RequestBody @Valid AccountDto accountdto) {
		return new ResponseEntity<>(service.createAccount(accountdto),HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public List<Account> getAllAccount() {
		return service.getAllAccount();
	}
	
	@GetMapping("{id}")
	public Account getByid(@PathVariable int id, @RequestBody AccountDto account) throws UserNotFoundException{
	
	return service.getById(id,account);
		
		
	}

}
