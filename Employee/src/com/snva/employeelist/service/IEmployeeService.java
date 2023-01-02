package com.snva.employeelist.service;

import java.util.List;

import com.snva.employeelist.service.exception.EmployeeServiceException;
import com.snva.employeelist.bean.Employee;

/**
 * IEmployeeService is an interface which defines various abstract functions
 * for the service layer.
 */
public interface IEmployeeService
{
	public void addNewEmployee(Employee employee);
	public void removeEmployeeByName(List<Employee> employeelist);
	public List<Employee> showAllEmployeeInformation() throws EmployeeServiceException;
	
}
