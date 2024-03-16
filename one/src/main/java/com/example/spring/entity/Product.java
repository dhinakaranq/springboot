package com.example.spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Long price;
	private int qty;
	 
	@OneToOne
	@JsonBackReference
	@JoinColumn(name="cus_fk")
	private Customer customer;
	
}
