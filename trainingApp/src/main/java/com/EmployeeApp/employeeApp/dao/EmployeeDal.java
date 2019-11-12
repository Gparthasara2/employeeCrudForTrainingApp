package com.EmployeeApp.employeeApp.dao;

import java.util.List;

import com.EmployeeApp.employeeApp.model.*;
public interface EmployeeDal {
	
	public Employee create(Employee emp);
	
	public Boolean delete(Employee emp);
	
	public List<Employee> findAll();
	
	public Employee findById(String id);

	
}
