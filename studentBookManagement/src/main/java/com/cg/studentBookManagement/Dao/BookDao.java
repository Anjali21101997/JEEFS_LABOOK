package com.cg.studentBookManagement.Dao;

import com.cg.studentBookManagement.domain.LibraryOfBooks;

public interface BookDao {
	public void addBook(LibraryOfBooks b);
	void deleteBook(int book_Id);
	void updateBook(int book_Id, String book_name);

}
