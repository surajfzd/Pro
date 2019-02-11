package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.exception.InvalidMobileNumberException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI 
{
	public static void main(String[] args) throws InvalidMobileNumberException
	{
		AccountService accountservice=new AccountServiceImpl();
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("1. To get account details");
		System.out.println("2. To get recharge amount");
		System.out.println("3. exit");
		while(true)
		{
			
			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter mobile number");
				String mobileno=scanner.next();
				System.out.println(accountservice.getAccountDetails(mobileno));
				break;
			case 2: System.out.println("Enter mobile number");
				String mobno=scanner.next();
				System.out.println("Enter amount");
				double amount=scanner.nextDouble();
				System.out.println(accountservice.rechargeAccount(mobno,amount));
				break;
			case 3: System.exit(0);
				break;
			}
			System.out.println("exit successfully");
			
		}
		
		

	}
	
}
