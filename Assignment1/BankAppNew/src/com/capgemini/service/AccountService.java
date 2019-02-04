package com.capgemini.service;
import com.capgemini.exception.InsufficientOpeningBalanceException;
import com.capgemini.beans.Account;


public interface AccountService 
{
	Account createAccount(int accountNumber, int amount) throws InsufficientOpeningBalanceException;

}
