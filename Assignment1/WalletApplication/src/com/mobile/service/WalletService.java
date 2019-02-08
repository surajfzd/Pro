package com.mobile.service;

import java.math.BigDecimal;

import com.mobile.beans.Customer;
import com.mobile.beans.Wallet;

public interface WalletService 
{
	public Customer createAccount(String name, String mobileno, Wallet wallet);
	public BigDecimal showBalance(String mobileno);
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount);
	public Customer depositAmount(String mobileNo, BigDecimal amount);
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);

}
