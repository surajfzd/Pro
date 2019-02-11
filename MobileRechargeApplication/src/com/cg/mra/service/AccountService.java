package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumberException;

public interface AccountService 
{
	public Account getAccountDetails(String mobileNo) throws InvalidMobileNumberException;
	public double rechargeAccount(String mobileno, double rechargeAmount) throws InvalidMobileNumberException;

}
