package com.capg.xyzwallet.dao;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.exception.WalletException;

public interface IWalletDAO {
	public boolean createAccount(WalletBean w) throws WalletException;
	public double showBalance();
	public double withDraw(double amount) throws WalletException;
	public double fundTransfer(BigInteger phoneNumber,double amount) throws WalletException;
	public double deposit(double amount) throws WalletException;
	public boolean printTransaction(LocalDateTime fDate,LocalDateTime tDate,String type);
}
