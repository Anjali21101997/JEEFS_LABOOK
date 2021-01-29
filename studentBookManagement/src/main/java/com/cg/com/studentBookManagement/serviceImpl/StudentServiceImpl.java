package com.cg.com.studentBookManagement.serviceImpl;

import com.cg.studentBookManagement.Dao.StudentDao;
import com.cg.studentBookManagement.DaoImpl.StudentDaoImpl;
import com.cg.studentBookManagement.domain.Student;
import com.cg.studentBookManagement.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao stdao;
	public StudentServiceImpl() {
		stdao=new StudentDaoImpl();
	}

	@Override
	public void addStudent(int std_ID, String name) {
		Student s=new Student();
		s.setStd_Id(std_ID);
		s.setStd_Name(name);
		stdao.addStudent(s);
		
		}

	@Override
	public void issueBook(int std_ID,int book_ID) {
		stdao.issueUpdateStudent(std_ID, book_ID);
	
	}

	@Override
	public void returnBook(int std_ID,int book_ID) {
		stdao.returnUpdateStudent(std_ID, book_ID);
		
	}
	

}
