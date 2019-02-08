package com.mobile.repo;

import com.mobile.beans.Customer;

public interface WalletRepo 
{
	public boolean save(Customer customer);
	public Customer findOne(String mobileNo);

}
