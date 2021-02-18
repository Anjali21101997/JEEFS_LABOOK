package com.cg.ovs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
@RestController
public class CustomEntityExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<Object> handleEmailException(UserEmailException ex, WebRequest request){
		UserEmailExceptionResponse userEmailExceptionResponse =  new UserEmailExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(userEmailExceptionResponse,HttpStatus.BAD_REQUEST);
	}	
	@ExceptionHandler
	public ResponseEntity<Object> handleEmailNotFoundException(EmailNotFoundException ex, WebRequest request){
		EmailNotFoundExceptionResponse emailNotFoundException =  new EmailNotFoundExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(emailNotFoundException,HttpStatus.BAD_REQUEST);
	}	

}
