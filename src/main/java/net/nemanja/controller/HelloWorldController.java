package net.nemanja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/hello")
	public ModelAndView helloWorld() {
		
		return new ModelAndView("hello");
	}
}
