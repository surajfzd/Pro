package com.capgemini.beans;

public class Courses {

	private int courseID;
	private String courseName;
	
	
	public Courses(int courseID, String courseName) {
		
		this.courseID = courseID;
		this.courseName = courseName;
	}
	
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

}