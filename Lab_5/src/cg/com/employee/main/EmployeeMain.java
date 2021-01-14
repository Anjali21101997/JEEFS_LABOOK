package cg.com.employee.main;
import java.util.Scanner;

import com.cg.employee.exception.InvalidAgeException;
import com.cg.employee.exception.InvalidFirstNameException;
import com.cg.employee.exception.InvalidLastNameException;
import com.cg.employee.exception.InvalidSalException;
import com.cg.employee.service.*;


public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceImpl empl=new EmployeeServiceImpl();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee first name:");
		String fName=sc.nextLine();
		try {
			empl.getFirstName(fName);
		} catch (InvalidFirstNameException e) {System.out.println(e);}
			
		System.out.println("Enter the Employee last name:");
		String lName=sc.next();
		try {
			empl.getLastName(lName);
		} catch (InvalidLastNameException e) {
			System.out.println(e);
		}
		System.out.println("Enter the Employee Age:");
		int age=sc.nextInt();
		try {
			empl.getAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		System.out.println("Enter the Salary:");
		double sal=sc.nextDouble();
		try {
			empl.getSal(sal);
		} catch (InvalidSalException e) {
			System.out.println(e);
		}
		empl.display(null);
		
		
	}

}
