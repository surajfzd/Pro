package com.capgemini.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InsufficientOpeningBalanceException;
import com.capgemini.beans.Account;
import com.capgemini.repo.AccountRepo;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;



public class AccountTest 
{
AccountService accountService;
	
	@Mock
	AccountRepo accountRepo;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		accountService = new AccountServiceImpl(accountRepo);
	}

	/*
	 * create account
	 * 1.when the amount is less than 500 then system should throw exception
	 * 2.when the valid info is passed account should be created successfully
	 */
	
	@Test(expected=com.capgemini.exception.InsufficientOpeningBalanceException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InsufficientOpeningBalanceException
	{
		accountService.createAccount(101, 400);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAccountShouldBeCreatedSuccessfully() throws InsufficientOpeningBalanceException
	{
		Account account =new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepo.save(account)).thenReturn(true);
		assertEquals(account, accountService.createAccount(101, 5000));
	}

}
