package com.cg.employee.service;

import com.cg.employee.exception.InvalidAgeException;
import com.cg.employee.exception.InvalidFirstNameException;
import com.cg.employee.exception.InvalidLastNameException;
import com.cg.employee.exception.InvalidSalException;

import cg.com.employee.domain.Employee;

/**
 * Interface for services
 *
 */
public interface EmployeeService {
	/**
	 *Method for getting First Name of Employee
	 *
	 */
	
	void getFirstName(String firstName) throws InvalidFirstNameException;
	/**
	 * Method for getting Last Name of Employee
	 *
	 */
	void getLastName(String lastName) throws InvalidLastNameException;
	/**
	 * Method for getting Age of Employee
	 *
	 */
	void getAge(int age) throws InvalidAgeException;
	/**
	 * Method for getting Salary of Employee
	 *
	 */
	void getSal(double sal) throws InvalidSalException;
	/**
	 * Method for displaying Employee Details
	 *
	 */
	void display(Employee e);

}
