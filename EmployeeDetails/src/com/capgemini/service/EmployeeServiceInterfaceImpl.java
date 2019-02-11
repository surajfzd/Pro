package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exception.AddressNotGivenException;
import com.capgemini.exception.DuplicateIdGivenException;
import com.capgemini.exception.EmployeeNameNullException;
import com.capgemini.exception.IdNotGiverException;
import com.capgemini.exception.NameNotFoundException;
import com.capgemini.repo.EmployeeRepoInterfaceImpl;

public class EmployeeServiceInterfaceImpl implements EmployeeServiceInterface {

	private EmployeeRepoInterfaceImpl repository;

	public EmployeeServiceInterfaceImpl(EmployeeRepoInterfaceImpl repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Employee createEmployee(int id, String name, Address address) throws AddressNotGivenException,
			DuplicateIdGivenException, EmployeeNameNullException, IdNotGiverException, NameNotFoundException 
	{
		Employee employee = new Employee(id, name, address);
		
		if(name == "")
			throw new EmployeeNameNullException();
		if(id == 0)
			throw new IdNotGiverException();
		if(address.getName()=="")
			throw new AddressNotGivenException();
		if(address.getCountry().getCity() == null)
			throw new AddressNotGivenException();
		//if(searchById(id))
			//throw new DuplicateIdGivenException();
		
		if (repository.save(employee)) 
		{
			return employee;
		} 
		else 
		{ // When Duplicate id is Found
			return null;
		}

	}

	@Override
	public List<Employee> searchByName(String name) throws NameNotFoundException,EmployeeNameNullException 
	{
		{
			if(name == "")
				throw new EmployeeNameNullException();
			
			if(repository.findByName(name).isEmpty()) {
				System.out.println("name is not find");
				throw new NameNotFoundException();
			}

			return repository.findByName(name);
		}

		
	}
	
}