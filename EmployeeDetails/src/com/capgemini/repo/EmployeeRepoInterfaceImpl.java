package com.capgemini.repo;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Employee;

public class EmployeeRepoInterfaceImpl implements EmployeeRepoInterface {
	private Map<Integer, Employee> employees = new HashMap<>();

	@Override
	public boolean save(Employee employee) {

		if (employees.containsKey(employee.getId())) {
			return false;
		}

		employees.put(employee.getId(), employee);
		return true;
	}

	public List<Employee> findByName(String name) {

		List<Employee> list = new ArrayList<>();

		for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {

			if (entry.getValue().getName().equals(name)) {
				list.add(entry.getValue());
			}
		}

		return list;
	}

}