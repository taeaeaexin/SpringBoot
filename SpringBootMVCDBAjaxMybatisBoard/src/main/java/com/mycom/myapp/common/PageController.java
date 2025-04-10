package com.mycom.myapp.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

// jsp 페이지 이동 담당
@Controller
public class PageController {
	
	@GetMapping("/pages/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/pages/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/pages/board")
	public String board() {
		//예회처리 테스트
//		String s = null;
//		s.length();
		
		return "board";
	}
	
	// logout 페이지이동으로 처리
	// 
//	@GetMapping("/logout")
//	public String logout(HttpSession session) {
//		session.invalidate();
//		return "login";
//	}
	
	// 페이지 이동과 상관없는 테스트 용도
	// jackson, gson 두 library의 LocalDateTime 객체의 json 문자열 비교
//	@GetMapping("/pages/json")
//	@ResponseBody
//	public LocalDateTime json() {
//		return LocalDateTime.now();
//	}
	
	// 현재 Controller 작업 수행 시 예외 발생 처리 -> 예외 처리 jsp 이동
	// try catch의 catch()
	@ExceptionHandler(Exception.class)
	public String pageExceptionHandler(Exception ex, Model model, HttpServletRequest request) {
		model.addAttribute("exception", ex);
		model.addAttribute("requestURI", request.getRequestURI());
		return "error"; // error.jsp
	}
}