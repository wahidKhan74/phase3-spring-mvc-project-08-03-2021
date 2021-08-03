package com.dell.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/status" )
	public ModelAndView indexMapper() {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("username","Spring MVC Server");
		mv.addObject("message","Server is up & Running !");
		return mv;
	}
	
	@RequestMapping("/hello")
	public ModelAndView helloMapper(@RequestParam(value="username") String username) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("username",username);
		mv.addObject("message","Hello user !");
		return mv;
	}
	
	@RequestMapping("/response")
	public ModelAndView responseMapper(@RequestParam(value="username") String username) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("username",username);
		mv.addObject("message","Today is a good day!");
		return mv;
	}
}
