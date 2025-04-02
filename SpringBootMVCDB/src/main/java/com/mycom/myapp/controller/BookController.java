package com.mycom.myapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycom.myapp.dto.BookDto;
import com.mycom.myapp.service.BookService;

// url mapping은 front와 약속
@Controller
@RequestMapping("/books")
public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	// 목록 : /books/list, get, parameter X, list.jsp
	@GetMapping(value="/list")
	public String listBook(Model model) {
		List<BookDto> bookList = bookService.listBook();
		model.addAttribute("bookList", bookList);
		return "list";
	}
	
	// 상세 : /books/detail, get, parameter bookId, detailForm.jsp // /books/detail/10 path variable
	@GetMapping(value="/detail/{bookId}")
	public String detailBook(@PathVariable int bookId, Model model) {
		System.out.println(bookId);
		BookDto bookDto = bookService.detailBook(bookId);
		model.addAttribute("bookDto", bookDto);
		return "detailForm";
	}
	
	// 등록 : /books/insert, post, parameter BookDto, insertResult.jsp
	@PostMapping(value="/insert")
	public String insertBook(BookDto bookDto) {
		System.out.println(bookDto);
		int ret = bookService.insertBook(bookDto);
		System.out.println(ret);
		return "insertResult";
	}
	
	// 수정 : /books/update, post, parameter BookDto, updateResult.jsp
	@PostMapping(value="/update")
	public String updateBook(BookDto bookDto) {
		System.out.println(bookDto);
		int ret = bookService.insertBook(bookDto);
		System.out.println(ret);
		return "updateResult";
	}
	
	// 삭제 : /books/delete, get, parameter bookId, deleteResult.jsp
	@GetMapping(value="/delete/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
		System.out.println(bookId);
		int ret = bookService.deleteBook(bookId);
		return "deleteResult";
	}
	
	// insertFrom.jsp에 대한 요청도 BookController를 통해서 이동
	// 등록 화면 : /books/insertForm, get, parameter X, insertForm.jsp
	@GetMapping(value="/insertForm")
	public String insertForm(Model model) {
		return "insertForm";
	}

}
