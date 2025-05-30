package com.mycom.myapp.calc.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalcMain {
	public static void main(String[] args) {
		// 개발자가 직접 객체 생성
//		Calculator calculator = new Calculator(); // 생성된 객체 의존성
//		System.out.println(calculator.add(3,7));
		
		// Spring DI를 통한 객체 생성
		// main()에서 Spring Framework의 환경
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalcConfiguration.class); // 설정 Java Configuraion
		Calculator calculator = (Calculator)context.getBean("calculator"); // name 기준으로 객체를 DI
		System.out.println(calculator.add(3, 7));
		context.close();
	}

}
