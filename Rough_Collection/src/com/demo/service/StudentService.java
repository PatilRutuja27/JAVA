package com.demo.service;

import com.demo.bean.Student;
import com.demo.dao.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentService implements IStudentService {
	
	IStudentDao obj=new StudentDao();
	Scanner sc=new Scanner(System.in);

	@Override
	public boolean addStudent() {
		
		System.out.println("Enter Id :");
		int id=sc.nextInt();
		
		System.out.println("Enter Name :");
		String name=sc.next();
		
		System.out.println("Enter Marks :");
		int marks=sc.nextInt();
		
		System.out.println("Enter Date of Addmission :");
		String date=sc.next();
		
		LocalDate dt= LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Student s=new Student(id,name,marks,dt);
		return obj.save(s);
	}

	@Override
	public Set<Student> displayData() {
		
		return obj.getData();
	}

	@Override
	public Student findById() {
		System.out.println("Enter id :");
		int id=sc.nextInt();
		return obj.getById( id);
	}

	@Override
	public void findByName() {

		System.out.println("Enter Name :");
		String name=sc.next();
		//System.out.println(obj.getByName(name));
		List<Student> lst=obj.getByName(name);
		lst.stream().forEach(obj->System.out.println(obj));
	}

	@Override
	public boolean deleteById() {

		System.out.println("Enter id :");
		int id=sc.nextInt();
		return obj.removeById(id);
	}
	
	
	


}
