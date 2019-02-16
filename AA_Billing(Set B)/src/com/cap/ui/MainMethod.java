package com.cap.ui;

import java.util.Scanner;

import com.cap.dao.IRepo;
import com.cap.dao.Repo;
import com.cap.exception.ProductIdInvalidException;
import com.cap.service.IService;
import com.cap.service.Service;

import co.cap.bean.Product;

public class MainMethod {

	public static void main(String[] args) throws ProductIdInvalidException
	{
		IRepo robj=new Repo(); 
		IService service=new Service(robj);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Code");
		int code=sc.nextInt();
		sc.nextLine();
		boolean b=true;
		while(b)
		{
			if(code<=999 ||  code>=10000)
				{
				System.out.println("Enter valid code");
				code=sc.nextInt();
				sc.nextLine();
				}
				
			else
			{
				b=false;
			}
		}

		
		System.out.println("Enter Quantity");
		int qty=sc.nextInt();
		sc.nextLine();
		b=true;
		while(b)
		{
			if(qty<=0)
			{
				System.out.println("Enter valid quantity");
				qty=sc.nextInt();
				sc.nextLine();
			}
			else
			{
				b=false;
			}
		}
			try
			{int price;
			price = service.getProductDetails(code).getProdPrice();
			int total=price*qty;
			System.out.println("Line Total: "+total);
			}
			catch(ProductIdInvalidException e)
			{
				System.out.println("Product is not available for this id");
			}
		
		
			

	}

}
