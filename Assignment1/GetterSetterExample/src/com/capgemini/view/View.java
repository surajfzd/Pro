package com.capgemini.view;

import java.util.Scanner;
import com.capgemini.beans.Student;

public class View {
	
	public static void main(String args[])
	{
		Student st=new Student();
		st.setId(123);
		st.setName("xyz");
	
		System.out.println("ID: "+st.getId()+"\n"+"name: "+st.getName());
		
	}
	
	
	

}
