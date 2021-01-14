package com.cg.eis.bean;
/**
 * Employee Class for employee details such as
 * id,name,salary,designation,insurance scheme fields
 * 
 */

public class Employee {
	int id;
	String name;
	Double salary;
	String designation;
	String insuranceScheme;
/**
*Default constructor
*/
public Employee() {
		
	}
/**
 * Parameterized Constructor
 *
 */
public Employee(int id, String name, Double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

}
