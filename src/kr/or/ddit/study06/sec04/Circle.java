package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Circle {
	
	// final 값이 계속 고정되어 있는 변하지 않는 값 (상수)
	// Math.PI는 파이의 값 = 3.14
	final double PI = Math.PI;

	// 반지름을 파라미터로 받고 원의 넓이를 구하시오
	// 넓이 	3.14*r*r
	// 메소드명 area
//	public double area(double r) {
//		return 3.14*r*r;
//	}
	
	public double area(double r) {
		return PI*r*r;
	}
	

	
	// 반지름을 파라미터로 받고 원의 둘레를 구하시오
	// 둘레 	2*3.14*r
	// 메소드명 circumference
//	public double circumference(double r) {
//		return Math.round((2*3.14*r)*10)/10.0;
//	}

	public double circumference(double r) {
		return Math.round((2*PI*r)*10)/10.0;
	}


}