package com.example.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Studentdetails")
@AllArgsConstructor
@NoArgsConstructor
public class StuVO {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Studentid;
	private String studentcode;
	private String studentname;
	private String course;
	
	
	
}
