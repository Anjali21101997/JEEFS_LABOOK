package com.cg.studentBookManagement.service;

public interface StudentService {
	public void addStudent(int std_ID,String name);
	public void issueBook(int std_ID,int book_ID);
	public void returnBook(int std_ID,int book_ID);
	

}
