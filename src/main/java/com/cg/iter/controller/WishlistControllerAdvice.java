package com.cg.iter.controller;

import org.springframework.http.HttpStatus; 
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

import com.cg.iter.dto.ErrorMessage;
import com.cg.iter.exception.CrudException;
import com.cg.iter.exception.CustomExceptionHandler;
import com.cg.iter.exception.NullParameterException;

@RestController
@RestControllerAdvice
public class WishlistControllerAdvice {


	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(CrudException.class)
	public ErrorMessage handleDataNotExistsException(CrudException ex)
	{
	 return new ErrorMessage(HttpStatus.BAD_REQUEST.toString(), ex.getMessage(), LocalDateTime.now().toString());
	       //To Handle Wish LIst Does Not Exists Exception	
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(NullParameterException.class)
	public ErrorMessage handleNotNullDAta(NullParameterException ex)
	{
	  return new ErrorMessage(HttpStatus.NOT_FOUND.toString(), ex.getMessage(), LocalDateTime.now().toString());
	  		//To Handle Wish LIst Does Not Exists Exception	
	}
	
}
	
	