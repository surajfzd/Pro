package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.InvalidMobileNumberException;

public class AccountServiceImpl implements AccountService
{
	AccountDao accountdao=new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidMobileNumberException 
	{
		return accountdao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileno, double rechargeAmount) throws InvalidMobileNumberException 
	{
		return accountdao.rechargeAccount(mobileno,rechargeAmount);
	}
	

}
