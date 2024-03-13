package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.Repository.StuRepo;
import com.example.student.entity.StuVO;

@Service
public class ServiceImple implements ServiceIF {
@Autowired
StuRepo stuRepo;
	

    @Override
	public StuVO createStudent(StuVO stuVO) {
		return stuRepo.save(stuVO);
	}


	@Override
	public List<StuVO> getAllBook() {
		return stuRepo.findAll();
		}


	@Override
	public StuVO getStudentId(Integer stuVOId) {
		return stuRepo.findById(stuVOId).orElse(null);
	}
	
    
	


	@Override
	public void deleteStuById(Integer stuVOId) {
		 stuRepo.deleteById(stuVOId);		
	}


	

	@Override
	public StuVO save(StuVO stuVO) {
		// TODO Auto-generated method stub
		return stuRepo.save(stuVO);
	}

	
	}

    
  


