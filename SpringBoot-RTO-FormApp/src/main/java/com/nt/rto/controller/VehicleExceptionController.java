package com.nt.rto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nt.rto.entity.ErrorResponse;
import com.nt.rto.exception.VehicleNotFoundException;



@ControllerAdvice
public class VehicleExceptionController {
	@ExceptionHandler(value = VehicleNotFoundException.class)
	 public ResponseEntity<Object> exception(VehicleNotFoundException exception) {
		  ErrorResponse errorResponse=new ErrorResponse();
		  errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		  errorResponse.setErrorMessage(exception.getMessage());
	      return new ResponseEntity<Object>(errorResponse, HttpStatus.NOT_FOUND);
	   }
}
