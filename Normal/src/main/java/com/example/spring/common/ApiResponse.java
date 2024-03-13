package com.example.spring.common;

import lombok.Data;

@Data
public class ApiResponse {

	private int status;
	private Object data;
	private Object error;
	
	public ApiResponse() {
		super();
		this.status = 200;
		this.data = data;
		this.error = error;
	}
}
