package com.mycom.myapp.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// DI 용도가 아니라 spring에게 Interceptor 정책 전달
@Configuration
public class InterceptorConfig implements WebMvcConfigurer{	
	// #1
	//	@Autowired
//	private MyInterceptor myInterceptor;
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(myInterceptor)
//				.addPathPatterns("/**")
//				.excludePathPatterns("/login/**"); // interceptor를 적용하지 않을 대상
//	}
	
	// #2
	@Autowired
	private MyInterceptor2 myInterceptor2;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor2)
				.addPathPatterns("/**")
				.excludePathPatterns("/login/**"); // interceptor를 적용하지 않을 대상
	}
}