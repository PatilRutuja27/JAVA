package com.demo.dao;

import com.demo.bean.Student;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StudentDao implements IStudentDao {
	
	Set<Student> set=new HashSet<>();
	
	{
		set.add(new Student(101,"aaa",89,LocalDate.of(2023, 05, 22)));
		set.add(new Student(102,"bbb",79,LocalDate.of(2023, 05, 22)));
		set.add(new Student(103,"ccc",99,LocalDate.of(2023, 05, 22)));
	}
	
	@Override
	public boolean save(Student s) {
		return set.add(s);
	}

	@Override
	public Set<Student> getData() {
		//System.out.println(set);
		return set;
	}

	
	@Override
	public Student getById(int id) {
		Student s= set.stream().filter(obj->obj.getId()==id).findFirst().orElse(null);
		return s;
	}

	
	@Override
	public List<Student> getByName(String name) {
		List<Student> lst=set.stream().filter(obj1->obj1.getName().equals(name)).collect(Collectors.toList());
		return lst;
	}

	@Override
	public boolean removeById(int id) {
		
		return set.remove(new Student(id));
	}
	
	
	
}
