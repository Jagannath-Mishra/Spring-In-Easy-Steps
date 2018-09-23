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
		
		view.addObject("id",123);
		view.addObject("name", "Jagannath Mishra");
		view.addObject("salary",25000.345);
		return view;
	}
}
