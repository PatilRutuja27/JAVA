package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.bean.Student;

public interface IStudentDao {

	boolean save(Student s);

	Set<Student> getData();

	Student getById(int id);

	List<Student> getByName(String name);

	boolean removeById(int id);

}
