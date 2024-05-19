package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Student;

public interface IStudentDao {
	boolean addStudent(Student obj);
	ArrayList<Student> getStudents();
	Student getStudentById(int id);
	List<Student> getStudentByName(String name);
	double getGPA(int id);
}
