package com.capgemini.bl;

import com.capgemini.beans.Courses;


public class AddCourse {
	
	private Courses[] courses=new Courses[10]; 
	
private int counter=0;
	
	public String addCourse(int courseID,String courseName)
	{
		
		courses[counter++]=new Courses(courseID,courseName);
		return "Course added successfully";
		
	}
	
	public void showCourses()
	{
		for(int i=0;i<counter;i++)
		{
			System.out.println(courses[i].getCourseID());
			System.out.println(courses[i].getCourseName());
		}
	}

}