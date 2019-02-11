package com.capgemini.service;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientOpeningBalanceException;
import com.capgemini.exception.InvaldiAccountException;
import com.capgemini.beans.Account;

public interface AccountService {
	Account createAccount(int accountNumber, int amount) throws InsufficientOpeningBalanceException;
	 

	Account withdrawAmount(int accountNumber, int amount)
			throws InsufficientBalanceException, InsufficientBalanceException;

	Account DepositAmount(int accountNumber, int amount) throws InvaldiAccountException;
}
