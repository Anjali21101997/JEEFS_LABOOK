package com.cg.eis.service;


import java.util.ArrayList;

import com.cg.eis.bean.Employee;

/**
 * Implementing all the abstract methods
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
    ArrayList<Employee> localRepository=new ArrayList<>();
	@Override
	public void getDetails(int id, String name, Double salary, String desig) {
		String insuranceScheme;
		if(salary<5000)
		{
			insuranceScheme="No Scheme";
		}
		else if(salary>5000 && salary<20000)
		{
			insuranceScheme="Scheme C";
		}
		else if(salary>20000 && salary<40000)
		{
			insuranceScheme="Scheme B";
		}
		else
		{
			insuranceScheme="Scheme A";
		}
		Employee emp=new Employee(id,name,salary,desig,insuranceScheme);
		localRepository.add(emp);
		
	}
	@Override
	public void getScheme(double sal, String design) {
		if(sal<5000 && design.equalsIgnoreCase("CLERK"))
		{
			System.out.println("No Scheme");
		}
		else if(sal>=5000 && sal<20000 && design.equalsIgnoreCase("System Associate"))
		{
			System.out.println("Scheme C");
		}
		else if(sal>=20000 && sal<40000 && design.equalsIgnoreCase("Programmer"))
		{
			System.out.println("Scheme B");
		}
		else
		{
			System.out.println("Scheme A");
		}
		
		
	}

	@Override
	public void displayDetails(int id) {
		for(Employee details:localRepository)
		{
			if(details.getId()==id)
			{
				System.out.println(details);
			}
		}
		
	}
	
}
	

