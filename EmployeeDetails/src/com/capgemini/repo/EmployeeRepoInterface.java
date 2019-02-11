package com.capgemini.repo;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeRepoInterface 
{
	boolean save(Employee employee);
	List<Employee> findByName(String name);

}
