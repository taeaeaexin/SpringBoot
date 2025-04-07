package com.mycom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	// Filter와 달리 Interceptor는 view로 forwarding 하는 과정에서도 동장
	// /abc : DispatcherServlet 다음으로 Controller 접근 과정에서 한번 실행 후 다시 DispatcherServlet
	// /abc/abc.html : DispatcherServlet이 다시 처리과정에서 한번 더 동작
	
	@GetMapping("/abc")
	public String abc() {
		System.out.println("/abc");
		return "/abc/abc.html";
	}

	@GetMapping("/login")
	public String login() {
		System.out.println("/login");
		return "/login/login.html";
	}
	
	@GetMapping("/login/success")
	public String loginSuccess(HttpSession session) {
		System.out.println("/loginSuccess");
		session.setAttribute("login", "success");
		return "/login/loginSuccess.html";
	}
}
