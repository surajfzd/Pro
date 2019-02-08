package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

public class Testing 
{
	WalletService walletservice=new WalletServiceImpl(new WalletRepoImpl());
	
	@Test(expected=com.capgemini.exception.DuplicateMobileNumberException.class)
	public void 
	{
		
	}
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
