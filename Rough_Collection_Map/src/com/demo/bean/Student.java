package com.demo.bean;

import java.time.LocalDate;

public class Student {
	private int Id;
	private String Name;
	private int Marks;
	private LocalDate DateOfAddmission;
	public Student(int id, String name, int marks, LocalDate dateOfAddmission) {
		super();
		Id = id;
		Name = name;
		Marks = marks;
		DateOfAddmission = dateOfAddmission;
	}
	public Student() {
		super();
	}
	
	
	
	public Student(int id) {
		super();
		Id = id;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public LocalDate getDateOfAddmission() {
		return DateOfAddmission;
	}
	public void setDateOfAddmission(LocalDate dateOfAddmission) {
		DateOfAddmission = dateOfAddmission;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Marks=" + Marks + ", DateOfAddmission=" + DateOfAddmission
				+ "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		return this.Id==((Student)obj).Id;
	}
	
	
}
