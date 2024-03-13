package com.example.spring.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Customer;
import com.example.spring.repository.CustomerRepo;
import com.example.spring.repository.ProductRepo;

@Service
public class ServiceImple implements ServiceIF {
	
	@Autowired
	CustomerRepo cuRepo;
	
	@Autowired
	ProductRepo pRepo;

	@Override
	public Customer createAccount(Customer customer) {
		return cuRepo.save(customer);
	}

	@Override
	public List<Customer> getAllaccounts(Set<String> add,String gen) {
		if (add==null) {
			return cuRepo.findAll();
		}
		else {
			return cuRepo.findAllByAddressInAndGender(add,gen);
		}
		}

	@Override
	public Customer getById(int id) {
	    return cuRepo.findById(id).orElse(null);
	}


	@Override
	public ResponseEntity<?> updateAccount(int id, Customer customer) {
		Customer cust=cuRepo.findById(id).get();
		cust.setName(customer.getName());
		cust.setAddress(customer.getAddress());
		cust.setGender(customer.getGender());
		cust.setProduct(customer.getProduct());
		return ResponseEntity.ok().body("update Successfully");
	}

	@Override
	public ResponseEntity<?> deleteAccount(int id) {
		cuRepo.deleteById(id);
		return ResponseEntity.ok().body("delete successfully");
	}

	@Override
	public List<Customer> getCustomerByRawQuery(Set<String> add) {
		List<Customer> bookList=cuRepo.getCustomerByAdd(add);
		return bookList;
	}

	

	

	
	

}
