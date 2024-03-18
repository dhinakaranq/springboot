package com.example.spring.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@ToString
public class AccountDto {
    @NotBlank(message = "Username sholud not be blank")
	private String name;
    @Max(60)
    @Min(18)
	private int age;
    @NotBlank(message = "gender must be fil")
	private String gender;
	private double moblie;
}
