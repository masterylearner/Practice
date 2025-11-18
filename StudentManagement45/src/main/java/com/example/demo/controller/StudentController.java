package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CollegeStudentServiceImpl;
import com.example.demo.service.SchoolStudentServiceImpl;
import com.example.demo.service.StudentService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
public class StudentController {

	StudentService collegeStudentServiceImpl;
	StudentService schoolStudentServiceImpl;
	
public StudentController(CollegeStudentServiceImpl collegeStudentServiceImpl, SchoolStudentServiceImpl schoolStudentServiceImpl   ) {
		
		this.collegeStudentServiceImpl=collegeStudentServiceImpl;
		this.schoolStudentServiceImpl=schoolStudentServiceImpl;
		}
		
	
	
	

	@GetMapping("Fees/{type}")
	String getFees(@PathVariable String type) {

		if(type.equals("school"))
			return schoolStudentServiceImpl.getFees();
		if(type.equals("college"))
			return collegeStudentServiceImpl.getFees();
		return null;
	}

}
