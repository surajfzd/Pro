package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.exception.DuplicateMobileNumberException;
import com.capgemini.exception.InsufficientWalletBalanceException;
import com.capgemini.exception.InvalidMobileNumberException;

public interface WalletService 
{
	public Customer createCustomer(String name, String mobileno, Wallet wallet) throws DuplicateMobileNumberException;
	public BigDecimal showBalance(String mobileno) throws InvalidMobileNumberException;
	public Customer depositAmount(String mobileno, BigDecimal amount) throws InvalidMobileNumberException;
	public Customer withdrawAmount(String mobileno, BigDecimal amount) throws InvalidMobileNumberException, InsufficientWalletBalanceException;
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws InvalidMobileNumberException, InsufficientWalletBalanceException;
}
