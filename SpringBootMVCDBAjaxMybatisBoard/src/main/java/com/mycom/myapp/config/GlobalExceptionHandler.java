package com.mycom.myapp.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 개별 Controller 에서 처리하지 않는 예외 일관 처리 <= @ControllerAdvice (Controller이 Proxy 이용)
// 현재 Spring MVC + JSP + Ajax 구조에서는 Ajax 처리 전담
// fetch data 요청에 대해 "result":"exception" 응답
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public Map<String, String> handlerException(Exception e) {
		// Map 자료구조를 이용해서 result:success 포함 추가적인 정보를 전달하려면 Map 객체에 추가
		// Client는 적절한 조치를 취함
        Map<String, String> map = new HashMap<>();
        map.put("result", "exception");
        return map;
	}
		
}