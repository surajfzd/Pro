package com.main.view;

import java.util.Scanner;

import com.gettersetter.met.GetterSetter;

public class MainGetterSetter {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int i=sc.nextInt();
		
		GetterSetter obj=new GetterSetter("Singh",21);
		
		obj.setName(st);
		obj.setAge(i);
		
		System.out.println("Name: "+obj.getName());
		System.out.println("Name: "+obj.getAge());

	}

}
