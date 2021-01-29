package com.cg.studentBookManagement.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int std_Id;
	private String std_Name;
	@OneToMany(cascade=CascadeType.PERSIST)  
	List<LibraryOfBooks> issued_Books=new ArrayList<>();
	public int getStd_Id() {
		return std_Id;
	}
	public void setStd_Id(int std_Id) {
		this.std_Id = std_Id;
	}
	public String getStd_Name() {
		return std_Name;
	}
	public void setStd_Name(String std_Name) {
		this.std_Name = std_Name;
	}
	public List<LibraryOfBooks> getIssued_Books() {
		return issued_Books;
	}
	public void setIssued_Books(List<LibraryOfBooks> issued_Books) {
		this.issued_Books = issued_Books;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
