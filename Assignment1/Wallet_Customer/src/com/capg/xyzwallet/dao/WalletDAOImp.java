package com.capg.xyzwallet.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.capg.xyzwallet.bean.BalanceDetails;
import com.capg.xyzwallet.bean.Deposit;
import com.capg.xyzwallet.bean.FundTransfer;
import com.capg.xyzwallet.bean.PrintTransaction;
import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.Withdraw;
import com.capg.xyzwallet.database.WalletDataBase;

public class WalletDAOImp implements IWalletDAO {
	List<PrintTransaction> transaction = new ArrayList<>();
	List<Withdraw> withdrawList = new ArrayList<>();
	List<Deposit> depositList = new ArrayList<>();
	List<FundTransfer> fundTranserList = new ArrayList<>();

	BalanceDetails balancedetails = new BalanceDetails();

	@Override
	public boolean createAccount(WalletBean w) {
		return WalletDataBase.getAccountList().add(w);
	}

	@Override
	public double showBalance() {
		return WalletDataBase.getBalancedetails().get(0).getBalance();
	}

	@Override
	public double withDraw(double amount) {
		double balance = 0.0;
		// WalletDatabase.getBalancedetails();
		// LocalDateTime date = LocalDateTime.now();
		// Deposit deposit = new Deposit();

		if (WalletDataBase.getBalancedetails().get(0).getBalance() > amount) {
			balance = WalletDataBase.getBalancedetails().get(0).getBalance()
					- amount;
			balancedetails.setBalance(balance);
			WalletDataBase.getBalancedetails().set(0, balancedetails);
		}
		return balance;
	}

	@Override
	public double fundTransfer(BigInteger phoneNumber, double amount) {

		double balance1 = 0.0;
		double balance2 = 0.0;

		if (WalletDataBase.getBalancedetails().get(0).getBalance() > amount) {
			
			balance1 = WalletDataBase.getBalancedetails().get(0).getBalance() - amount;
			balancedetails.setBalance(balance1);
			WalletDataBase.getBalancedetails().set(0, balancedetails);
			
			WalletDataBase.getBalancedetails();
			balance2 = WalletDataBase.getBalancedetails().get(1).getBalance() + amount;
			balancedetails.setBalance(balance2);
			WalletDataBase.getBalancedetails().set(1, balancedetails);
		}
		return balance1;
	}

	@Override
	public double deposit(double amount) {
		//double balance = 0.0;
		WalletDataBase.getBalancedetails();
		double balance = WalletDataBase.getBalancedetails().get(0).getBalance()
				+ amount;
		balancedetails.setBalance(balance);
		WalletDataBase.getBalancedetails().set(0, balancedetails);

		return balance;
	}

	@Override
	public boolean printTransaction(LocalDateTime fDate, LocalDateTime tDate,
			String type) {

		ArrayList<Deposit> depositResult = new ArrayList<>();

		PrintTransaction printTransaction = new PrintTransaction();
		/*
		 * printTransaction.setDeposits(depositList);
		 * printTransaction.setFundTransfers(fundTranserList);
		 * printTransaction.setWithDraws(withdrawList);
		 * printTransaction.setBalanceDetails(balanceList);
		 */
		for (Deposit deposit : depositList) {
			System.out.println();
			if (deposit.getDate().isAfter(fDate)
					&& deposit.getDate().isBefore(tDate)) {
				System.out.println(deposit.toString());
			}
		}
		return true;
	}
}