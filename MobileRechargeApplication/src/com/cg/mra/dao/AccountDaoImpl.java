package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumberException;

public class AccountDaoImpl implements AccountDao
{
	Map<String,Account> accountEntry;
	
	
	
	public AccountDaoImpl()
	{
		accountEntry=new HashMap<>();
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9932012345", new Account("Prepaid", "Vikas", 631));
		accountEntry.put("9010210135", new Account("Prepaid", "Anju", 521));
		accountEntry.put("9010210133", new Account("Prepaid", "Tushar", 632));
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidMobileNumberException 
	{
		if(accountEntry.get(mobileNo)==null) {
			throw new InvalidMobileNumberException();
		}
		return accountEntry.get(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) throws InvalidMobileNumberException
	{
		Account account=accountEntry.get(mobileNo);
		if(account==null) {
			throw new InvalidMobileNumberException();

		}
		account.setAccountBalance(account.getAccountBalance()+rechargeAmount);
		double amount=account.getAccountBalance();
		return amount;
	}

}
