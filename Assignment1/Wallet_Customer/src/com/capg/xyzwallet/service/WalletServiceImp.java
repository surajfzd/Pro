package com.capg.xyzwallet.service;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.dao.IWalletDAO;
import com.capg.xyzwallet.dao.WalletDAOImp;
import com.capg.xyzwallet.exception.WalletException;
import com.capg.xyzwallet.exception.WalletExceptionMessages;

public class WalletServiceImp implements IWalletService{

	
	IWalletDAO dao = new WalletDAOImp();
	WalletBean bean = new WalletBean();

	@Override
	public boolean createAccount(WalletBean w) throws WalletException {
		boolean isCreated = true;
		if (validations(w)) {
			isCreated = dao.createAccount(w);
		} 		return isCreated;
	}

	@Override
	public double showBalance() {
		return dao.showBalance();
	}

	@Override
	public double withDraw(double amount) throws WalletException {
		return dao.withDraw(amount);
	}

	@Override
	public double fundTransfer(BigInteger phoneNumber,double amount) throws WalletException {
		// TODO Auto-generated method stub
		return dao.fundTransfer(phoneNumber,amount);
	}

	@Override
	public double deposit(double amount) throws WalletException {
		return dao.deposit(amount);
	}

	@Override
	public boolean validations(WalletBean w) throws WalletException {
		boolean isValid = true;
		if (!(w.getFirstName().matches("[a-zA-Z]{3,}"))){
			isValid = false;
			throw new WalletException(WalletExceptionMessages.ERRORNAME);
		}  if (!( w.getLastName().matches("[a-zA-Z]{3,}"))){
			isValid = false;
			throw new WalletException(WalletExceptionMessages.ERRORNAME);
		}  if (!(String.valueOf(w.getPhoneNumber())
				.matches("^[6-9][0-9]{9}"))) {
			isValid = false;
			throw new WalletException(WalletExceptionMessages.ERRORPHONE);
		}  if ((w.getAddress()==null)) {
			isValid = false;
			throw new WalletException(WalletExceptionMessages.ERRORADDRESS);
		}  if (!(w.getEmail()
				.matches("^[A-Za-z0-9.]+@[A-Za-z0-9.-]+\\\\.[A-Z]{2,6}$"))) {
			isValid = false;
			throw new WalletException(WalletExceptionMessages.ERROREMAIL);
		} 
		
		return isValid;
	}

	@Override
	public boolean validPhoneNumber(String phone) throws WalletException {
		boolean isValid = false; 
		if (phone.matches("(0)?[6-9][0-9]{9}")) {
			     
				isValid = true;
			}
		else{
             throw new WalletException(WalletExceptionMessages.ERRORPHONE);
		}
		return isValid;
	}

	@Override
	public boolean validAmount(double amount) throws WalletException {
		boolean isValid = false;
		if(amount > 0){
			isValid = true;
		}
		else
		{
			throw new WalletException(WalletExceptionMessages.ERRORBALANCE);
		}
		return isValid;
	}

	@Override
	public boolean printTransaction(LocalDateTime fDate,
			LocalDateTime tDate,String type) {
		// TODO Auto-generated method stub
		return dao.printTransaction(fDate, tDate, type);
	}
}