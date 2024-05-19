package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.bean.Student;

public interface IStudentService {
	boolean addStudent();
	
	Set<Student> displayData();
	
	Student findById(int id);
	
	List<Student> findByName(String name);
	
	boolean deleteById(int id);
	
}
