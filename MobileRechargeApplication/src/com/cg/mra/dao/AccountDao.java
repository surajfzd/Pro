package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumberException;

public interface AccountDao 
{
	public Account getAccountDetails(String mobileNo) throws InvalidMobileNumberException;
	double rechargeAccount(String mobileNo, double rechargeAmount) throws InvalidMobileNumberException;

}
