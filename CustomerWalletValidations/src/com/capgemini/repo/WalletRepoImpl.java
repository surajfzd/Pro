package com.capgemini.repo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.beans.Customer;
import com.capgemini.exception.InvalidMobileNumberException;

public class WalletRepoImpl implements WalletRepo {
	Map<String, Customer> hashmapobject = new HashMap<String, Customer>();

	@Override
	public boolean save(Customer customer) {
		if (hashmapobject.containsKey(customer.getMobileno())) {
			return false;
		} else {
			hashmapobject.put(customer.getMobileno(), customer);
		}
		return true;
	}

	@Override
	public Customer findOne(String mobileno) throws InvalidMobileNumberException
	{
		for (Entry<String, Customer> entry : hashmapobject.entrySet())
			if (entry.getKey().equals(mobileno))
				return entry.getValue();

		throw new InvalidMobileNumberException();
	}

}
