package com.bean;

import java.time.LocalDate;

public class Trainer 
{

	private String name;
	private String courseName;
	private LocalDate startDate;
	private LocalDate endDate;
	private int rating;
	
	
	public Trainer() 										//Default constructor
	{
		super();
	}

	
	public Trainer(String name, String courseName, LocalDate startDate, LocalDate endDate, int rating)    //Parameterized constructor to initialize values
	{
		super();
		this.name = name;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rating = rating;
	}

	//Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", courseName=" + courseName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", rating=" + rating + "]";
	}
	
	
	
	

}
