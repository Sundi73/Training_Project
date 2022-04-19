package com.project.sportyshoes;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandeler {
	@ExceptionHandler(Exception.class)
	public void  handleException1(Exception e) {
		e.printStackTrace();
	}
}