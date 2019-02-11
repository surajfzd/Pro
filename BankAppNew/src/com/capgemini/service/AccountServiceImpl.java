package com.capgemini.service;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientOpeningBalanceException;
import com.capgemini.exception.InvaldiAccountException;
import com.capgemini.beans.Account;
import com.capgemini.repo.AccountRepo;

public class AccountServiceImpl implements AccountService {
	AccountRepo accountRepo;

	public AccountServiceImpl(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}

	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientOpeningBalanceException {
		if (amount < 500) {
			throw new InsufficientOpeningBalanceException();
		}
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);

		if (accountRepo.save(account)) {
			return account;
		}
		return null;
	}

	@Override
	public Account withdrawAmount(int accountNumber, int amount) throws InsufficientBalanceException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		synchronized (account) {
			if ((account.getAmount() - amount) >= 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				account.setAmount(account.getAmount() - amount);
				return account;
			}

			throw new InsufficientBalanceException();

		}
	}

	@Override
	public Account DepositAmount(int accountNumber, int amount) throws InvaldiAccountException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		account.setAmount(account.getAmount() + amount);
		return account;
		// throw new InvalidAccountNumberException();

	}

}
