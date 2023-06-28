package com.newlecture.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("index controller");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("data","Hello Spring MVC~"); // 모델 만듦
		//mv.setViewName("index");  // 해당 뷰로 전송
		return mv; 
	}
	
}
