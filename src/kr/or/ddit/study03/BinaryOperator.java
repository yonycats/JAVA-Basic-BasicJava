package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		obj.process();
	}

	public void process() {
		// 이항 연산자 : 대부분의 연산자
		// 산술 연산자, 관계 연산자, 논리 연산자, 비트 연산자, 대입 연산자.
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method6(){
		// 시프트 연산자
		// >> <<
		
		int a=12;
		System.out.println(a>>2);
		System.out.println(a<<2);
		
	}
	
	public void method5() {
		// 논리 연산자
		// &, |, ~
		
		int a=45;
		int b=25;
		// 45 : 101101
		// 25 : 011001
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		
	}
	
	public void method4() {
		// 대입 연산자
		// = : '=' 오른쪽의 값을 '=' 왼쪽에 저장, 우선순위가 가장 늦다
		// '='와 다른 연산자가 결합
		// a=a+b   =>   a+=b
		// a=a-b   =>   a-=b
		// a=a/b   =>   a/=b
		// a=a*b   =>   a*=b
		// a=a%b   =>   a%=b
		
		int x=10;
		int y=15;
		int result=x+y;
		System.out.println(result);
		
		int a=10;
		int b=4;
		System.out.println("a=a+b => a+=b : "+(a+=b));
		System.out.println("a=a-b => a-=b : "+(a-=b));
		System.out.println("a=a/b => a/=b : "+(a/=b));
		System.out.println("a=a*b => a*=b : "+(a*=b));
		System.out.println("a=a%b => a%=b : "+(a%=b));
		
	}
	
	public void method3() {
		// 논리 연산자
		// &&, ||, !
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b);
		System.out.println(a&&!b);
		System.out.println(a||b);
		System.out.println(!a||b);
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		// B 학점
		// 90보다 작으면서 80보다 크거나 같다
		if(score>=80 && score<90) {
			System.out.println("B 학점");
		}
		
	}

	public void method2() {
		// 관계 연산자
		// 참 거짓으로 결과가 나옴
		// <, > , ==, >=, <=, !=
		
//		System.out.print("점수를 입력하세요 : ");
//		int num = sc.nextInt();
//	
//		// 100~90 A
//		if(num>=90) {
//			System.out.println("A 학점");
			
		int a = 10;
		int b = 10;
		if(a==b) {
			System.out.println("a와 b는 같은 값");
		}
		if(a!=b+1) {
			System.out.println("a와 b+1은 다른 값");
		}
	}
	
	public void method1() {
		// 산술 연산자
		// 종류 : +, -, /, *, %
		// 사칙연산과 마찬가지로 /, * 먼저 적용된다.
		
		int a = 5;
		int b = 3;
		 System.out.println("덧셈\t"+(a+b));
		 System.out.println("뺄셈\t"+(a-b));
		 System.out.println("나눗셈\t"+(a/b));
		 System.out.println("곱셈\t"+(a*b));
		 
		 System.out.println("나머지\t"+(a%b));
	}

}
