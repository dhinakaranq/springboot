package com.example.StudentMangementSystem.entity;

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
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int studentrollno;
	public int getStudentrollno() {
		return studentrollno;
	}
	public void setStudentrollno(int studentrollno) {
		this.studentrollno = studentrollno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	private String studentname;
	private float percentage;
	private String branch;
	
}
