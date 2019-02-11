package com.capgemini.exceptiontest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.exception.AddressNotGivenException;
import com.capgemini.exception.DuplicateIdGivenException;
import com.capgemini.exception.EmployeeNameNullException;
import com.capgemini.exception.IdNotGiverException;
import com.capgemini.exception.NameNotFoundException;
import com.capgemini.repo.EmployeeRepoInterface;
import com.capgemini.repo.EmployeeRepoInterfaceImpl;
import com.capgemini.service.EmployeeServiceInterface;
import com.capgemini.service.EmployeeServiceInterfaceImpl;


public class ExceptionTest {
	
	
	EmployeeRepoInterface repo = new EmployeeRepoInterfaceImpl();
	EmployeeServiceInterface serv = new EmployeeServiceInterfaceImpl((EmployeeRepoInterfaceImpl) repo);

	@Test(expected = com.capgemini.exception.EmployeeNameNullException.class)
	public void WhenNameIsNotGivenThrowAnError() throws AddressNotGivenException, EmployeeNameNullException, IdNotGiverException, AddressNotGivenException, DuplicateIdGivenException, NameNotFoundException 
	{
		
		City city = new City("Pune");
		Country country = new Country("india", city);
		Address add = new Address("talwade", country);
		serv.createEmployee(123, "", add);
		
	}

}
