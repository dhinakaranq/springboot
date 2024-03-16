package com.example.spring.GobalException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> invaildError(MethodArgumentNotValidException ex){
		Map<String, String> errorMap=new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(error->{
			if (error instanceof FieldError) {
	            FieldError fieldError = (FieldError) error;
	            errorMap.put(fieldError.getField(), error.getDefaultMessage());
	        } else {
	            errorMap.put(error.getObjectName(), error.getDefaultMessage());
	        }
	    });
	    return errorMap;
	}
	}


