package com.mindtree.restoline.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.restoline.dto.ErrorDTO;
import com.mindtree.restoline.dto.ResponseBodys;
import com.mindtree.restoline.exception.RestoLineAppException;

@RestControllerAdvice
public class RestoLineControllerHandler {
	
	@ExceptionHandler(RestoLineAppException.class)
	public ResponseEntity<?> errorHandler(Exception e) {
		return new ResponseEntity<ResponseBodys<Void>>(new ResponseBodys<Void>(null,
				new ErrorDTO(e.getMessage(), e.getCause()), "Error in Application", false),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		String errorMessaage = "";
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			errorMessaage += error.getDefaultMessage() + ", ";
		}

		return new ResponseEntity<ResponseBodys<Void>>(new ResponseBodys<Void>(null,
				new ErrorDTO(errorMessaage, ex.getCause()), "Error in Application", false), HttpStatus.BAD_REQUEST);

	}
}
