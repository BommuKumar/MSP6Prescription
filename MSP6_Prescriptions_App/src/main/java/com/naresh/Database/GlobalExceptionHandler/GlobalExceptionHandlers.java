package com.naresh.Database.GlobalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.naresh.Database.CustomException.InvalidDetails;

import feign.FeignException;

@RestControllerAdvice
public class GlobalExceptionHandlers {
	
	   @ExceptionHandler(InvalidDetails.class)
      public ResponseEntity<String> invalidDetailsHandler( InvalidDetails ex)
      {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getLocalizedMessage());
      }
	    
	   
	   @ExceptionHandler(FeignException.class)
	      public ResponseEntity<String> FeignExceptionHandler( FeignException ex)
	      {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getLocalizedMessage());
	      }
}
