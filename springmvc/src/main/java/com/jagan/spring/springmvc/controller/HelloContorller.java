package com.jagan.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloContorller {

	@RequestMapping("/hello")
	public ModelAndView hello(){
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		return view;
	}
}
