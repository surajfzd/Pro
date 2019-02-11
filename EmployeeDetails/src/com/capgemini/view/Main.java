package com.capgemini.view;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.exception.AddressNotGivenException;
import com.capgemini.exception.DuplicateIdGivenException;
import com.capgemini.exception.EmployeeNameNullException;
import com.capgemini.exception.IdNotGiverException;
import com.capgemini.exception.NameNotFoundException;
import com.capgemini.repo.EmployeeRepoInterfaceImpl;
import com.capgemini.service.EmployeeServiceInterface;
import com.capgemini.service.EmployeeServiceInterfaceImpl;
/*import com.capgemini.exception.AddressNotGivenException;
import com.capgemini.exception.DuplicateIdGivenException;
import com.capgemini.exception.EmployeeNameNullException;
import com.capgemini.exception.IdNotGiverException;
import com.capgemini.exception.NameNotFoundException;
import com.capgemini.repo.EmployeeRepoInterfaceImpl;
import com.capgemini.service.EmployeeServiceInterface;
import com.capgemini.service.EmployeeServiceInterfaceImpl;
*/
public class Main {

	public static void main(String[] args) throws AddressNotGivenException, DuplicateIdGivenException, EmployeeNameNullException, IdNotGiverException, NameNotFoundException {

		EmployeeServiceInterface service = new EmployeeServiceInterfaceImpl(new EmployeeRepoInterfaceImpl());

		City city = new City();
		city.setName("Pune");
		Country country = new Country();
		country.setName("India");
		country.setCity(city);
		Address address = new Address();
		address.setName("XYZ");
		address.setCountry(country);

		//System.out.println(service.createEmployee(101, "Suraj Singh", address));

		System.out.println(service.createEmployee(102, "Rahul Singh",
				new Address("Lane1", new Country("India", new City("Agra")))));
		System.out.println(service.createEmployee(103, "Vansh Arora",
				new Address("ABC", new Country("India", new City("Pune")))));
		System.out.println("Match Found: "+service.searchByName("Vansh Arora"));
		
	}

}