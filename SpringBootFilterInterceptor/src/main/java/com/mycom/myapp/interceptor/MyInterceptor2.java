package com.mycom.myapp.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class MyInterceptor2 implements HandlerInterceptor {
	// return boolean : 더 진행할지 말지
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hander) throws Exception {
		System.out.println("MyInterceptor2 >>>preHandle " + request.getRequestURI());
		
		// session에서 "login" 확인을 통해서 return true, return false 처리
		HttpSession session = request.getSession();
		String login = (String) session.getAttribute("login");
		if("success".equals(login)) return true;
		System.out.println("login " + login);
		response.getWriter().write("need login");
		return false;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		System.out.println("MyInterceptor2 >>> postHandel " + request.getRequestURI());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		System.out.println("MyInterceptor2 >>> afterCompletion Interceptor Job");
	}
}