package com.cg.com.studentBookManagement.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.studentBookManagement.Dao.BookDao;
import com.cg.studentBookManagement.DaoImpl.BookDaoImpl;
import com.cg.studentBookManagement.dbUtil.DbUtil;
import com.cg.studentBookManagement.domain.LibraryOfBooks;
import com.cg.studentBookManagement.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDao bookdao;
	public BookServiceImpl() {
		bookdao=new BookDaoImpl();
	}

	@Override
	public void addBook(int book_ID, String book_Name) {
		LibraryOfBooks books=new LibraryOfBooks();
		books.setBook_ID(book_ID);
		books.setBook_Name(book_Name);
		bookdao.addBook(books);
		}

	@Override
	public void deleteBook(int book_ID) {
		bookdao.deleteBook(book_ID);
		}

	@Override
	public void findBook() {
		DbUtil dbutil=new DbUtil();
		EntityManager entityManager=dbutil.createEntityManager();
		entityManager.getTransaction().begin();
		 Query query = entityManager.createQuery( "Select book from LibraryOfBooks book ");
		 @SuppressWarnings("unchecked")  
         List<LibraryOfBooks> list=(List<LibraryOfBooks>)query.getResultList( );  
         System.out.print("s_id");  
         System.out.print("\t s_name");  
         for( LibraryOfBooks book :list )
         {  
             System.out.println( book.getBook_ID( ));  
             System.out.print("\t" +  book.getBook_Name( ));  
             System.out.println();
         }
		
	}
}

