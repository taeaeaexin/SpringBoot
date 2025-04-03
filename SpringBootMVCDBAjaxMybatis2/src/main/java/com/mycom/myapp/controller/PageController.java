package com.mycom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// emps.jsp 이동은 pageController
@Controller
public class PageController {
	
	@GetMapping("/emps/")
	public String emp() {
		return "emps";
	}
	
	@GetMapping("/salary/")
	public String salary() {
		return "salary";
	}
	
	@GetMapping("/store/")
	public String store() {
		return "store";
	}
}
