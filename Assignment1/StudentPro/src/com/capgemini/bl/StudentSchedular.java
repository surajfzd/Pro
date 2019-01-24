package com.capgemini.bl;

import com.capgemini.beans.Courses;
import com.capgemini.beans.Student;




public class StudentSchedular {
	
	private Student[] students = new Student[10];
	private Courses[] cTemp;
	
	private int counterStudent;
	private int cNum;
	
	public String addStudent(int rollNumber,String name,Courses[] courses)
	{
		cNum=courses.length;
		students[counterStudent++]=new Student(rollNumber,name,courses);
		return "Student added successfully";
		
	}
	
	public void showAllStudents()
	{
		for(int i=0;i<counterStudent;i++)
		{
			System.out.println(students[i].getRollNumber());
			System.out.println(students[i].getName());
			cTemp=students[i].getCourses();
			for(int j=0;j<cTemp.length;j++) {
			System.out.println(cTemp[j].getCourseName());
			}
		}
		
		
	}
	

	
}
