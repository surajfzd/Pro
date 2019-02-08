package com.mobile.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.mobile.beans.Customer;
import com.mobile.beans.Wallet;
import com.mobile.repo.WalletRepo;
import com.mobile.repo.WalletRepoImpl;

public class WalletServiceImpl implements WalletService {

	private WalletRepoImpl repo;

	public WalletServiceImpl(WalletRepoImpl repo) {
		super();
		this.repo = repo;
	}
	
	
	
	//CREATE ACCOUNT
	@Override
	public Customer createAccount(String name, String mobileno, Wallet wallet) {
		Customer customer = new Customer(name, mobileno, wallet);
		if (repo.save(customer)) {
			return customer;
		}
		return null;
	}
	
	
	//SHOW BALANCE
	@Override
	public BigDecimal showBalance(String mobileno) {
		return repo.findOne(mobileno).getWallet().getBalance();
	}

	
	
	//DEPOSIT AMOUNT
	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		Customer customer = repo.findOne(mobileNo);
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().add(amount));
		customer.setWallet(wallet);
		return customer;
	}
	
	
	
	
	//WITHDRAW AMOUNT
	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		Customer customer=repo.findOne(mobileNo);
		Wallet wallet=customer.getWallet();
		//if(wallet.getBalance().compareTo(amount)==-1)
		//{
		//	return null;
		//}
		wallet.setBalance(wallet.getBalance().subtract(amount));
		customer.setWallet(wallet);
		return customer;
	}
	
	
	//FUND TRANSFER
		@Override
		public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) 
		{
			
			Customer customer=repo.findOne(sourceMobileNo);
			withdrawAmount(sourceMobileNo, amount);
			depositAmount(targetMobileNo, amount);
			
			
			return customer;
		}

}
