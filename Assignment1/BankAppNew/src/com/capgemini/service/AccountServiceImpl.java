package com.capgemini.service;
import com.capgemini.exception.InsufficientOpeningBalanceException;
import com.capgemini.beans.Account;
import com.capgemini.repo.AccountRepo;

public class AccountServiceImpl implements AccountService
{
	AccountRepo accountRepo;
	public AccountServiceImpl(AccountRepo accountRepo)
	{
		super();
		this.accountRepo=accountRepo;
	}
	
	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientOpeningBalanceException
	{
		if(amount<500)
		{
			throw new InsufficientOpeningBalanceException();
		}
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		
		if(accountRepo.save(account))
		{
			return account;
		}
		return null;
	}
}



