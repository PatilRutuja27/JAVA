package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.bean.Student;

public class StudentDao implements IStudentDao {
	
	static ArrayList<Student> lst;
	
	static {
		lst=new ArrayList<>();
		lst.add(new Student(101,"Rajesh",87,77,82));
		lst.add(new Student(102,"Amol",81,67,72));
		lst.add(new Student(103,"Kedar",77,72,92));
	}
	

	@Override
	public boolean addStudent(Student obj) {
		return lst.add(obj);
	}

	@Override
	public ArrayList<Student> getStudents() {
		
		return  lst;
	}

	@Override
	public Student getStudentById(int id) {
		int Id=lst.indexOf(new Student(id));
		if(Id!=-1) {
			return lst.get(Id);
		}
		return null;
	}

	@Override
	public List<Student> getStudentByName(String name) {
		
		List<Student> lstArr = lst.stream()
				.filter(ob->ob.getName().equals(name))
				.collect(Collectors.toList());
		if(lstArr.isEmpty()) {
			return null;
		}
		return lstArr;
	}

	@Override
	public double getGPA(int id) {
		int Id=lst.indexOf(new Student(id));
		if(Id!=-1) {
			return lst.get(Id).getGPA();
		}
		return 0;
	}


}
