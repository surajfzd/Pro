package com.capgemini.view;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.repository.EmployeeRepo;
import com.capgemini.repository.EmployeeRepoImp;
import com.capgemini.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeRepo empRepo = new EmployeeRepoImp();
		EmployeeService empService  = new EmployeeService(empRepo);
		 
		City city = new City("pune");
		Country country = new Country("india", city);
		Address add = new Address("talwade", country);
		
		City city1 = new City("delhi");
		Country country1 = new Country("india", city1);
		Address add1 = new Address("chandni chauck", country1);
		
		empService.createEmployee("123", "vikash", add);
		empService.createEmployee("456", "shivam", add1);
		
		System.out.println(empService.searchByName("shivam"));
	}

}
