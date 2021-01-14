package com.cg.employee.service;
/**
 * Implementing all the methods of EmployeeService Interface
 *
 */
import com.cg.employee.exception.InvalidAgeException;
import com.cg.employee.exception.InvalidFirstNameException;
import com.cg.employee.exception.InvalidLastNameException;
import com.cg.employee.exception.InvalidSalException;

import cg.com.employee.domain.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	Employee emp=new Employee();

	@Override
	public void getFirstName(String firstName) throws InvalidFirstNameException {
		if(firstName.length()==0)
		{
		throw new InvalidFirstNameException("FIRST NAME CANNOT BE BLANK");
		}
		else
		{
			emp.setFirstName(firstName);
		}
	}
	@Override
	public void getLastName(String lastName) throws InvalidLastNameException {
		if(lastName==null) {
		throw new InvalidLastNameException("LAST NAME CANNOT BE BLANK");
		}
		else
		{
			emp.setLastName(lastName);
		}
	}
	@Override
	public void getAge(int age) throws InvalidAgeException {
		if(age<15)
		{
		throw new InvalidAgeException("AGE CANNOT BE LESS THAN 15");
	}
		else
		{
			emp.setAge(age);
		}
		}
	@Override
	public void getSal(double sal) throws InvalidSalException {
		if(sal<3000)
		{
		throw new InvalidSalException("SAL CANNOT BE LESS THAN 3000");
	}
		else
		{
			emp.setSal(sal);
		}
		}
	@Override
	public void display(Employee e) {
		System.out.println("Employee Name:"+emp.getFirstName()+" "+ emp.getLastName());
		System.out.println("Employee Age:" +emp.getAge());
		System.out.println("Employee Salary: "+emp.getSal());
		
	}
	
	
	

}
