package com.cg.studentBookManagement.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryOfBooks {
	@Id
	private int book_ID;
	private String book_Name;
	public LibraryOfBooks() {
		super();
	}
	public int getBook_ID() {
		return book_ID;
	}
	public void setBook_ID(int book_ID) {
		this.book_ID = book_ID;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

}
