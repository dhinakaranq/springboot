package com.example.spring.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.dto.AccountDto;
import com.example.spring.entity.Account;
import com.example.spring.thorw.UserNotFoundException;

@Service
public interface ServiceIF {

	Account createAccount(AccountDto accountdto);

	List<Account> getAllAccount();

	Account getById(int id, AccountDto account) throws UserNotFoundException;

	ResponseEntity<?> upadateAccount(int id, Account account);

	ResponseEntity<?> deleteAccount(int id);

}
