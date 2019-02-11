package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.exception.DuplicateMobileNumberException;
import com.capgemini.exception.InsufficientWalletBalanceException;
import com.capgemini.exception.InvalidMobileNumberException;
import com.capgemini.repo.WalletRepo;

public class WalletServiceImpl implements WalletService {
	WalletRepo repo;

	public WalletServiceImpl() {
		super();
	}

	public WalletServiceImpl(WalletRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Customer createCustomer(String name, String mobileno, Wallet wallet) throws DuplicateMobileNumberException
	{
		Customer customer = new Customer(name, mobileno, wallet);
		if (repo.save(customer))
			return customer;
		throw new DuplicateMobileNumberException();
	}

	@Override
	public BigDecimal showBalance(String mobileno) throws InvalidMobileNumberException
	{
		return repo.findOne(mobileno).getWallet().getBalance();
	}

	@Override
	public Customer depositAmount(String mobileno, BigDecimal amount) throws InvalidMobileNumberException
	{
		Customer customer = repo.findOne(mobileno);
		Wallet wallet = customer.getWallet();
		wallet.setBalance(wallet.getBalance().add(amount));
		customer.setWallet(wallet);
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileno, BigDecimal amount) throws InvalidMobileNumberException, InsufficientWalletBalanceException
	{
		Customer customer=repo.findOne(mobileno);
		if(customer.getWallet().getBalance().compareTo(amount)==-1)
			{
				throw new InsufficientWalletBalanceException();
			}
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().subtract(amount));
		customer.setWallet(wallet);
		return customer;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws InvalidMobileNumberException, InsufficientWalletBalanceException
	{
		Customer customer=withdrawAmount(sourceMobileNo, amount);
		depositAmount(targetMobileNo,amount);
		return customer;
	}
	

}
