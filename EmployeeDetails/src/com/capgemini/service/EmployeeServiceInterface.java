package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exception.AddressNotGivenException;
import com.capgemini.exception.DuplicateIdGivenException;
import com.capgemini.exception.EmployeeNameNullException;
import com.capgemini.exception.IdNotGiverException;
import com.capgemini.exception.NameNotFoundException;


public interface EmployeeServiceInterface {

	Employee createEmployee(int id, String name, Address address) throws AddressNotGivenException, DuplicateIdGivenException, EmployeeNameNullException,IdNotGiverException,NameNotFoundException;

	List<Employee> searchByName(String name) throws EmployeeNameNullException, NameNotFoundException;

}