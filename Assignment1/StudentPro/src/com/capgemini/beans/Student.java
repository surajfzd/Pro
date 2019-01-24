package com.capgemini.beans;
import com.capgemini.beans.Courses;

public class Student {

	private int rollNumber;
	private String name;
	
	private Courses[] courses;
	
	
	
	public Courses[] getCourses() {
		return courses;
	}

	public void setCourses(Courses[] courses) {
		this.courses = courses;
	}

	public Student(int rollNumber, String name,Courses[] courses ) {
		//super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.courses=courses;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}