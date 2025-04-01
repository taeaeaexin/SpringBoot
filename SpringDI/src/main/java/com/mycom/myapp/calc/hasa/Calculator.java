package com.mycom.myapp.calc.hasa;

import org.springframework.stereotype.Component;

@Component("abc")
public class Calculator {
	public int add(int n1, int n2) {
		return n1 + n2;
	}
}
