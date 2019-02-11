package com.cg.rc.service;

import java.util.List;

import com.cg.rc.bean.Account;
import com.cg.rc.bean.Options;
import com.cg.rc.dao.AccountDAO;
import com.cg.rc.dao.AccountDAOImpl;

public class AccountServiceImpl implements AccountService{

private AccountDAO daoRef = new AccountDAOImpl();
	
	@Override
	public List<Account> findAll() {
		List<Account> accounts = daoRef.findAll();
		return accounts; 
	}
	
	@Override
	public List<Account> sortAccountDetails(Options option) {
		return daoRef.sortAccountDetails(option);
	}
	
	@Override
	public boolean create(Account newAccount) {
		return daoRef.create(newAccount);
	}

	@Override
	public boolean delete(int id) {
		
		return daoRef.delete(id);
	}

	@Override
	public boolean update(int id, Account account) {
		// TODO Auto-generated method stub
		return daoRef.update(id, account);
	}

	@Override
	public Account findById(int id) {
		return daoRef.findById(id);
	}
	

	

}
