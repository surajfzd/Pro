package com.capgemini.ui;

import java.math.BigDecimal;

import com.capgemini.beans.Wallet;
import com.capgemini.exception.DuplicateMobileNumberException;
import com.capgemini.exception.InsufficientWalletBalanceException;
import com.capgemini.exception.InvalidMobileNumberException;
import com.capgemini.repo.WalletRepo;
import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

public class MainMethod {

	public static void main(String[] args) 
	{
		WalletRepo repo=new WalletRepoImpl();
		WalletService service=new WalletServiceImpl(repo);
		
		try
		{
			System.out.println(service.createCustomer("Suraj", "9897934489", (new Wallet(new BigDecimal("100.0")))));
		}
		catch(DuplicateMobileNumberException e)
		{
			System.out.println("DuplicateMobileNumberException");
		}
		try
		{
			System.out.println(service.createCustomer("Rahul", "9999999999", (new Wallet(new BigDecimal("200.0")))));
		}
		catch(DuplicateMobileNumberException e)
		{
			System.out.println("DuplicateMobileNumberException");
		}
		try {
		System.out.println(service.createCustomer("Rahul", "9999999999", (new Wallet(new BigDecimal("200.0")))));
		System.out.println(service.showBalance("9897934489"));
		System.out.println(service.depositAmount("9897934489", (new BigDecimal("50.0"))));
		System.out.println(service.withdrawAmount("9897934489", (new BigDecimal("70.0"))));
		System.out.println(service.fundTransfer("9897934489", "9999999999", (new BigDecimal("20.0"))));
		}
		catch(DuplicateMobileNumberException e)
		{
			System.out.println("DuplicateMobileNumberException");
		}
		catch(InvalidMobileNumberException e)
		{
			System.out.println("InvalidMobileNumberException");
		}
		catch(InsufficientWalletBalanceException e)
		{
			System.out.println("InsufficientWalletBalanceException");
		}
			
		
	}

}
