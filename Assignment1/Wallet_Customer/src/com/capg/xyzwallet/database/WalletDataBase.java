package com.capg.xyzwallet.database;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.capg.xyzwallet.bean.BalanceDetails;
import com.capg.xyzwallet.bean.WalletBean;

public class WalletDataBase {

	private static List<WalletBean> list = new ArrayList<>();
	private static List<BalanceDetails> balanceList = new ArrayList<>();

	static {
		WalletBean walletBean = new WalletBean();
		walletBean.setFirstName("hari");
		walletBean.setLastName("varun");
		walletBean.setPhoneNumber(new BigInteger("6542312423"));
		walletBean.setAddress("address-1");
		walletBean.setEmail("mshvarunkumar@gmail.com");
		walletBean.setUserName("HariVarun");
		list.add(walletBean);
		WalletBean walletBean2 = new WalletBean();
		walletBean2.setFirstName("hema");
		walletBean2.setLastName("vasavi");
		walletBean2.setPhoneNumber(new BigInteger("7416368112"));
		walletBean2.setAddress("address-2");
		walletBean2.setEmail("mshvarunkumar96@gmail.com");
		walletBean2.setUserName("HariVarun");
		list.add(walletBean2);
		
		BalanceDetails balanceDetails = new BalanceDetails();
		balanceDetails.setBalance(2000.0);
		balanceDetails.setPhoneNumber(new BigInteger("1234567890"));
		balanceList.add(balanceDetails);
		
		BalanceDetails balanceDetails2 = new BalanceDetails();
		balanceDetails2.setBalance(3000.0);
		balanceDetails2.setPhoneNumber(new BigInteger("1234567891"));
		balanceList.add(balanceDetails2);
	}

	public static List<WalletBean> getAccountList() {
		return list;
	}

	public static List<BalanceDetails> getBalancedetails() {
		return balanceList;
	}
}