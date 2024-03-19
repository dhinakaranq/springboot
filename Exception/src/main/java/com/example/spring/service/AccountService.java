package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.dto.AccountDto;
import com.example.spring.entity.Account;
import com.example.spring.repository.AccountRepo;
import com.example.spring.thorw.UserNotFoundException;

@Service
public class AccountService implements ServiceIF {
	@Autowired
	AccountRepo aRepo;

	

	@Override
	public List<Account> getAllAccount() {
		return aRepo.findAll();
	}

	@Override
	public Account getById(int id, AccountDto account) throws UserNotFoundException {
		Account account1= aRepo.findById(id).orElse(null);
		if(account1!=null) {
			return aRepo.findById(id).orElse(null);
		}
		else {
			throw new UserNotFoundException("user not found with id:"+id);
		}
	}

	@Override
	public Account createAccount(AccountDto accountdto) {
	Account account= Account.build(0, accountdto.getName(), accountdto.getAge(), accountdto.getGender(), accountdto.getMoblie());
	return aRepo.save(account);
	
	}

	@Override
	public ResponseEntity<?> upadateAccount(int id, Account account) {
		Account accou=aRepo.findById(id).get();
		accou.setName(account.getName());
		accou.setAge(account.getAge());
		accou.setGender(account.getGender());
		accou.setMoblie(account.getMoblie());
		
		aRepo.save(accou);
		
		return ResponseEntity.ok().body("Update Successfully!");
	}

	@Override
	public ResponseEntity<?> deleteAccount(int id) {
		aRepo.deleteById(id);
		return ResponseEntity.ok().body("Delete Succussfully!");
	}

	@Override
	public Page<Account> getByPaginationSort(int offset, int pageSize, String field) {
		return aRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
	}
}
