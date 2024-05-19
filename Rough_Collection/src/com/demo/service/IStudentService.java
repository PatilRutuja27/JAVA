package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.bean.Student;

public interface IStudentService {
	boolean addStudent();
	
	Set<Student> displayData();
	
	Student findById();
	
	void findByName();
	
	boolean deleteById();
	
}
