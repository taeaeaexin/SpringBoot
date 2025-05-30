package com.mycom.myapp.calc.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {
	public static void main(String[] args) {
		// 개발자가 직접 객체 생성
//		Calculator calculator = new Calculator(); // 생성된 객체 의존성
//		System.out.println(calculator.add(3,7));
		
		// Spring DI를 통한 객체 생성
		// main()에서 Spring Framework의 환경
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/calc-annotation.xml"); // 설정 xml 문서
//		Calculator calculator = context.getBean(Calculator.class); // Id와 무관하게 객체를 DI
//		Calculator calculator = (Calculator)context.getBean("calculator"); // Id와 무관하게 객체를 DI
		Calculator calculator = (Calculator)context.getBean("abc"); // Id 기준으로 객체를 DI
		System.out.println(calculator.add(3, 7));
		context.close();
	}

}
