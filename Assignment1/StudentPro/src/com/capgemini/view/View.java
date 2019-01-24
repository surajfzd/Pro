package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.bl.StudentSchedular;
import com.capgemini.beans.Courses;
import com.capgemini.bl.AddCourse;

public class View {

	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();
	private static AddCourse addCourse=new AddCourse();
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		
		int choice;
		
		while(true)
		{
			System.out.println("1.Add a student");
			System.out.println("2.Show students' details");
			//System.out.println("3.show all students");
			System.out.println("3.exit");
			System.out.println();
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
				case 1:addStudentDetails();
					break;   
				case 2:showAllStudents();
					break;
				case 3: System.exit(0);
					break;
			 default:System.out.println("Sorry entered wrong choice");
				   
			  
				   
			   
			}
			
		}
		
	}

	private static void addCourses() {
		System.out.println("enter course id");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter course name");
		String name = sc.next();
		
		System.out.println(addCourse.addCourse(rollNumber, name));
		
	}

	private static void showAllStudents() {
		studSch.showAllStudents();
		addCourse.showCourses();
		
		
	}

	private static void addStudentDetails() {
		String courseTemp;
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter the number of courses");
		
		int numOfCourses = sc.nextInt();
		Courses[] courses = new Courses[numOfCourses];
		
		System.out.println("enter "+ numOfCourses +" number of courses");
		for(int i=0;i<numOfCourses;i++)
		{
			courseTemp=sc.next();
			courses[i]=new Courses(i+1,courseTemp);
		}
		
		
		
		System.out.println(studSch.addStudent(rollNumber, name, courses));
		System.out.println(" ");
		
	}

}