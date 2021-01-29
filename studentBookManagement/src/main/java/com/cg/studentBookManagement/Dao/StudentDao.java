package com.cg.studentBookManagement.Dao;

import com.cg.studentBookManagement.domain.Student;

public interface StudentDao {
	public void addStudent(Student s);
	public void deleteStudent(int std_id);
	public void returnUpdateStudent(int std_ID,int book_ID);
	public void issueUpdateStudent(int std_ID, int book_ID);
}
