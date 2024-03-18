package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}