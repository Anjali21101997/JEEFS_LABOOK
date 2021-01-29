package com.cg.studentBookManagement.DaoImpl;

import javax.persistence.EntityManager;

import com.cg.studentBookManagement.Dao.BookDao;
import com.cg.studentBookManagement.dbUtil.DbUtil;
import com.cg.studentBookManagement.domain.LibraryOfBooks;

public class BookDaoImpl implements BookDao {
	DbUtil dbutil;
	EntityManager entitymanager;
	public BookDaoImpl() {
		dbutil=new DbUtil();
	}

	@Override
	public void addBook(LibraryOfBooks b) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(b);
		entitymanager.getTransaction().commit();
		
	}
	@Override
	public void deleteBook(int book_Id) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		LibraryOfBooks books=entitymanager.find(LibraryOfBooks.class, book_Id);
		entitymanager.remove(books);
		entitymanager.getTransaction().commit();
		}
	@Override
	public void updateBook(int book_Id,String book_name) {
		entitymanager=dbutil.createEntityManager();
		entitymanager.getTransaction().begin();
		LibraryOfBooks books=entitymanager.find(LibraryOfBooks.class, book_Id);
		books.setBook_Name(book_name);
		entitymanager.persist(books);
		entitymanager.getTransaction().commit();
		
		
	}
	

}
