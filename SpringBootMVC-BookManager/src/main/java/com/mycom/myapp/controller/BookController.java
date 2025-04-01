package com.mycom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mycom.myapp.dto.BookDto;

@Controller
public class BookController {
	@GetMapping("/BookManager")
	public String bookManager(Model model) {
		BookDto book = new BookDto(1,"스프링부트 백엔드 개발자 되기","유레카",10000);
		model.addAttribute("bookDto", book);
		return "BookManager";
	}

}
