package com.mobile.view;

import java.math.BigDecimal;
import com.mobile.beans.Wallet;
import com.mobile.repo.WalletRepo;
import com.mobile.repo.WalletRepoImpl;
import com.mobile.service.WalletService;
import com.mobile.service.WalletServiceImpl;

public class MainMethod {

	public static void main(String[] args) 
	{

		WalletService walletservice=new WalletServiceImpl(new WalletRepoImpl());
		
		System.out.println(walletservice.createAccount("Suraj", "9897934489", new Wallet(new BigDecimal("50000"))));
		System.out.println(walletservice.createAccount("Vansh", "9999999999", new Wallet(new BigDecimal("20000"))));
		System.out.println(walletservice.createAccount("Sushil", "8888888888", new Wallet(new BigDecimal("30000"))));
		System.out.println(walletservice.showBalance("9897934489"));
		System.out.println(walletservice.depositAmount("9897934489", new BigDecimal("12345")));
		System.out.println(walletservice.withdrawAmount("9897934489", new BigDecimal("20000")));
		System.out.println(walletservice.fundTransfer("9897934489", "9999999999", new BigDecimal("20000")));
		
	}

}
