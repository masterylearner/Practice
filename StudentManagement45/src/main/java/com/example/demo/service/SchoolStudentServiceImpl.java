package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SchoolStudentServiceImpl implements StudentService {

	@Override
	public String getFees() {
		// TODO Auto-generated method stub
		return "School Fees is 25000k";
	}

}
