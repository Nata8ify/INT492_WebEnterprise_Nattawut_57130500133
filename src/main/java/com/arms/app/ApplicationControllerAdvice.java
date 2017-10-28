package com.arms.app;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ApplicationControllerAdvice {
	
	/*Global Exception Handler*/
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(ModelAndView mav, Exception exp){
		mav.setViewName("error/500");
		return mav;
	}
	
	/* Abnormally HttpStatus Handler*/
	@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
	public ModelAndView notFound404Handler(ModelAndView mav){
		mav.setViewName("error/404");
		return mav;
	}
	
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	public ModelAndView badRequest400Handler(ModelAndView mav){
		mav.setViewName("error/400");
		return mav;
	}
}
