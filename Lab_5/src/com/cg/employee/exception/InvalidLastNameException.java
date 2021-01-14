package com.cg.employee.exception;

public class InvalidLastNameException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidLastNameException() {
		super();
	}
    public InvalidLastNameException(String msg) {
		super(msg);
	}
}
