package com.example.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.entity.StuVO;

@Service
public interface ServiceIF {

	StuVO createStudent(StuVO stuVO);

	List<StuVO> getAllBook();

	StuVO getStudentId(Integer stuVOId);


	void deleteStuById(Integer stuVOId);




	StuVO save(StuVO stuVO);

}
