package com.mycom.myapp.calc.hasa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {
	public static void main(String[] args) {
		// Spring DI를 통한 객체 생성
		// main()에서 Spring Framework의 환경
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/hasa-calc-annotation.xml"); // 설정 xml 문서
		HasaCalculator hahaCalculator = (HasaCalculator)context.getBean("hasaCalculator"); // Id 기준으로 객체를 DI
		System.out.println(hahaCalculator.add(3, 7));
		context.close();
	}

}