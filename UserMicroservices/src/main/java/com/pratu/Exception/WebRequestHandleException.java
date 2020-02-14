package com.pratu.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class WebRequestHandleException extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request){
		ExceptionResponse exp= new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(exp,HttpStatus.INTERNAL_SERVER_ERROR);
	}



	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> UserNotFoundException( UserNotFoundException ex, WebRequest request){
		ExceptionResponse exp= new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(exp,HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object>handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionResponse exp = new ExceptionResponse(new Date(), "validation failed", ex.getBindingResult().toString());
		return new ResponseEntity<Object>(exp,HttpStatus.BAD_GATEWAY);
	}
}
