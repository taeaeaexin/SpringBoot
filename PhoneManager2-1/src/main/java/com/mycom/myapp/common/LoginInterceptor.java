package com.mycom.myapp.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.mycom.myapp.user.dto.UserDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {
	private final String jsonStr = "{\"result\":\"login\"}";
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("LoginInterceptor > " + request.getRequestURI());

        HttpSession session = request.getSession();
        UserDto user = (UserDto) session.getAttribute("user");

        if (user == null) {
            if ("true".equals(request.getHeader("ajax"))) {
                System.out.println("LoginInterceptor > ajax request ");
                response.setContentType("application/json; charset=UTF-8");
                response.getWriter().write(jsonStr);
            } else {
                System.err.println("LoginInterceptor > page request ");
                response.sendRedirect("/login");
            }
            return false;
        }
        return true;
    }
}
