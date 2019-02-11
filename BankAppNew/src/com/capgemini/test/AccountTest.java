package com.capgemini.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientOpeningBalanceException;
import com.capgemini.exception.InvaldiAccountException;
import com.capgemini.beans.Account;
import com.capgemini.repo.AccountRepo;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class AccountTest {
	AccountService accountService;

	@Mock
	AccountRepo accountRepo;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		accountService = new AccountServiceImpl(accountRepo);
	}

	@Test(expected = com.capgemini.exception.InsufficientOpeningBalanceException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException()
			throws InsufficientOpeningBalanceException {
		accountService.createAccount(101, 600);
	}

	@Test
	public void whenTheValidInfoIsPassedAccountShouldBeCreatedSuccessfully()
			throws InsufficientOpeningBalanceException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepo.save(account)).thenReturn(true);
		assertEquals(account, accountService.createAccount(101, 5000));
	}

	@Test(expected = com.capgemini.exception.InsufficientBalanceException.class)
	public void whenTheWithdrawalAmountIsGreaterThanAvailableAccount() throws InsufficientBalanceException {
		accountService.withdrawAmount(101, 6000);
	}

	@Test
	public void whenTheValidInfoPassedWithdrawAccountSuccessfully() throws InsufficientBalanceException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(2000);
		when(accountRepo.searchAccount(account.getAccountNumber())).thenReturn(account);
		assertEquals(account, accountService.withdrawAmount(101, 3000));

	}

	@Test
	public void whenAmountIsDepositedSuccessfully() throws InvaldiAccountException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(8000);
		when(accountRepo.searchAccount(account.getAccountNumber())).thenReturn(account);
		assertEquals(account, accountService.DepositAmount(101, 3000));

	}

}