package com.cg.studentBookManagement.DaoImpl;

import javax.persistence.EntityManager;

import com.cg.studentBookManagement.Dao.StudentDao;
import com.cg.studentBookManagement.dbUtil.DbUtil;
import com.cg.studentBookManagement.domain.LibraryOfBooks;
import com.cg.studentBookManagement.domain.Student;

public class StudentDaoImpl implements StudentDao {
	DbUtil dbutil;
	EntityManager entitymanager;
	public StudentDaoImpl() {
		dbutil=new DbUtil();
	}

	@Override
	public void addStudent(Student s) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(s);
		entitymanager.getTransaction().commit();
}
	@Override
	public void deleteStudent(int std_id) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		Student s=entitymanager.find(Student.class, std_id);
		entitymanager.remove(s);
		entitymanager.getTransaction().commit();
		
		
		
	}
	@Override
	public void issueUpdateStudent(int std_ID,int book_ID) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		LibraryOfBooks book=entitymanager.find(LibraryOfBooks.class, book_ID);
		Student student=entitymanager.find(Student.class, std_ID);
		student.getIssued_Books().add(book);
		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		
	}

	@Override
	public void returnUpdateStudent(int std_ID, int book_ID) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		Student student=entitymanager.find(Student.class, std_ID);
		LibraryOfBooks book=entitymanager.find(LibraryOfBooks.class, book_ID);
		student.getIssued_Books().remove(book);
		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		
	}
		
	}

