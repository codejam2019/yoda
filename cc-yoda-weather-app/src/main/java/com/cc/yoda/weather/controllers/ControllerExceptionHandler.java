package com.cc.yoda.weather.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public String handleSQLException(HttpServletRequest request, Exception ex) {
		logger.info("Exception: " + request.getRequestURL());
		return new String("Exception. Please contact admin.");
	}
}
