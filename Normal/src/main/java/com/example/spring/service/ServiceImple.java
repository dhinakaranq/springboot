package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Customer;
import com.example.spring.repository.CustomerRepo;

@Service
public class ServiceImple implements ServiceIF{

	@Autowired
	CustomerRepo cRepo;

	@Override
	public Customer createAccount(Customer customer) {
		return cRepo.save(customer);
	}

	@Override
	public List<Customer> getAllAccounts(String cit) {
		if(cit==null) {
			return cRepo.findAll();
		}
		else {
			return cRepo.findAllByCity(cit);
		}
	}

	@Override
	public Customer getByid(int id) {
		return cRepo.findById(id).orElse(null);
	}

	@Override
	public ResponseEntity<?> updateAccount(int id, Customer customer) {
	Customer account=cRepo.findById(id).get();
	account.setName(customer.getName());
	account.setGender(customer.getGender());
	account.setCity(customer.getCity());
	cRepo.save(account);
	return ResponseEntity.ok().body("update succuesfully");
	}



	@Override
	public ResponseEntity<?> deleteAccount(int id) {
	cRepo.deleteById(id);
	return ResponseEntity.ok().body("update successfully");
	}

	
}
