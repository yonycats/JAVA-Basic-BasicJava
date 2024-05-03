package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScanExample {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		// 메서드 process를 호출		
		obj.process(); 
	}
	
	public void process() {
		// 메서드 method1을 호출
//		method1(); 
//		method2();
//		method3();
//		method4();
		method5();
		
	}
	
	public void method5() {
		// 환전
		System.out.println("3자리 문자를 입력하세요 : ");
		String word = sc.next();
		// String -> char
		// 3자리 문자를 하나씩 끊어서 출력하기
		char ch1 = word.charAt(0);
		char ch2 = word.charAt(1);
		char ch3 = word.charAt(2);
		
		System.out.println("1번째 문자 : "+ch1);
		System.out.println("2번째 문자 : "+ch2);
		System.out.println("3번째 문자 : "+ch3);
	}
	
	public void method4() {
		// 환전
		System.out.println("환전할 달러를 입력하세요 : ");
		String dollor = sc.next();
		double exchangeRate = 1349.88;
		double won = Double.parseDouble(dollor)*exchangeRate;
		
		// 10원 단위로 출력하시오.
		int wonInt = (int)(won/10)*10;
		System.out.println(dollor+"$는 "+wonInt+"원 입니다.");
	}
	
	public void method3() {
		// 숫자 개를 입력받아 두 수를 더하시오.
		System.out.println("숫자를 입력하세요 : ");
		String a = sc.next();
		
		System.out.println("숫자를 입력하세요 : ");
		String b = sc.next();
		
		int result = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("a+"+"b="+result);
	}
	
	public void method2() {
		System.out.println("숫자를 입력하세요 : ");
		String input = sc.next();
		
		// input 을 int로 바꾼 후, 10을 더하세요.
		int num = Integer.parseInt(input)+10;
		System.out.println("입력 결과 값 : "+num);
	}
	
	public void method1() {
		System.out.println("문자를 입력하세요 : ");
		String input = sc.next();
		System.out.println("입력 결과 값 : "+input);
	}
}