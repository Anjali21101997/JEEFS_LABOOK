package com.cg.employee.exception;

public class InvalidFirstNameException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public InvalidFirstNameException()
	{
		super();
	}
	public InvalidFirstNameException(String msg)
	{
		super(msg);
	}

}
