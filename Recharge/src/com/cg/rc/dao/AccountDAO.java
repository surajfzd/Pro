package com.cg.rc.dao;

import java.util.List;

import com.cg.rc.bean.Account;
import com.cg.rc.bean.Options;

public interface AccountDAO {

	public List<Account> findAll();
	public List<Account> sortAccountDetails(Options option);
	public boolean create(Account newAccount);
	public boolean delete(int id);
	public boolean update(int id, Account account);
	public Account findById(int id);

}
