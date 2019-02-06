package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.repo.EmployeeRepoInterfaceImpl;

public class EmployeeServiceInterfaceImpl implements EmployeeServiceInterface {

	private EmployeeRepoInterfaceImpl repository;
	public EmployeeServiceInterfaceImpl(EmployeeRepoInterfaceImpl repository) {
		super();
		this.repository = repository;
	}
	
	
	
	@Override
	public Employee createEmployee(int id, String name, Address address) {
		
		Employee employee = new Employee(id, name, address);
		
		if(repository.save(employee)) {
			return employee;
		}
		else {		// When Duplicate id is Found
			return null;	
		}
		
	}
	
	
	@Override
	public List<Employee> searchByName(String name) {
		
		return repository.findByName(name);
	}

	
}