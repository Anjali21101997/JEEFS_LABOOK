package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {
	public static void showMenu()
	{
	System.out.println("*****WELCOME TO EMPLOYEE INSURANCE MANAGEMENT SYSTEM******");
	System.out.println("Enter your Choice:");
	System.out.println("1. Add an Employee");
	System.out.println("2. Get Insurance Scheme");
	System.out.println("3. Display Details of an Employee");
	}

	public static void main(String[] args) {
		
		EmployeeServiceImpl emplImpl= new EmployeeServiceImpl();
		Scanner sc= new Scanner(System.in);
		String ch;
		do {
			EmployeeMain.showMenu();
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Employee ID:");
				int id=sc.nextInt();
			    System.out.println("Enter Employee Name:");
			    String name=sc.next();
			    System.out.println("Enter Employee Salary:");
			    Double salary=sc.nextDouble();
			    System.out.println("Enter Employee Designation:");
			    String desig=sc.next();
			    emplImpl.getDetails(id,name,salary,desig);
				break;
				
			case 2:
				System.out.println("Enter the Salary and Designation");
				double sal=sc.nextDouble();
				String design=sc.next();
				emplImpl.getScheme(sal,design);
				
				
			case 3:
				System.out.println("Enter Employee Id:");
				int id_emp=sc.nextInt();
				emplImpl.displayDetails(id_emp);
				break;
				
				
			default:
				System.out.println("You have Entered a Wrong choice");
				break;
			}
			System.out.println("Do you want to continue:yes|no");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
			
}
}