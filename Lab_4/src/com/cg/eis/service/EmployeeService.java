package com.cg.eis.service;
/**
 * Interface for all the services
 *
 */

public interface EmployeeService {
/**
*Method for getting Employee Details from user
*
*/
void getDetails(int id, String name, Double salary, String desig);
/**
 *Method for getting Insurance Scheme depending upon the salary
 * and designation
 */
void getScheme(double sal, String design);
/**
*Method for displaying details of an Employee
*
*/
void displayDetails(int id);
}

