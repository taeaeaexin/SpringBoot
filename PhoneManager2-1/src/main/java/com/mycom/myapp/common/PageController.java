package com.mycom.myapp.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mycom.myapp.user.dto.UserDto;
import com.mycom.myapp.user.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PageController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/home")
	public String home(HttpSession session) {
		if(session.getAttribute("user") == null) return "redirect:/login";
		return "home";
	}
	
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
	    return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
	    return "redirect:/";
	}

	@PostMapping("/register")
	public String UserRegister(UserDto user) {
		userService.registerUser(user);
		System.out.println("회원가입 정보: " + user.getUserName() + ", " + user.getUserEmail());

		return "redirect:/login";
	}
	
	@PostMapping("/login")
	public String Userlogin(HttpSession session, UserDto user, Model model) {
	    UserDto loginUser = userService.loginUser(user);

	    if (loginUser != null) {
	        session.setAttribute("user", loginUser);
	        return "redirect:/home";
	    } else {
	        model.addAttribute("msg", "이메일 또는 비밀번호가 틀렸습니다.");
	        return "login";
	    }
	}
}
