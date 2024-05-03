package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	WhileExample obj = new WhileExample();
	obj.process();
}

public void process() {
//	method1();
//	method2();
//	method3();
//	method4();
//	method5();
	method6();
}

public void method6() {
	
	
	
}

public void method5() {
	// 값이 false일 때, 최초 1번은 실행되고 종료됨
	
	do {
		System.out.println("실행");
	} while (true);
	
}

public void method4() {
	// 숫자를 입력받고 모든 자릿수의 합을 구하시오.
	// while 문 이용	
	
	System.out.println("숫자를 입력하시오.");
	int num = sc.nextInt();
	int sum = 0;
	
	while(num>0) {
		sum+=num%10;
//		System.out.println("sum은 "+sum);
		num/=10;
//		System.out.println("num은 "+num);
	}
	System.out.println("각 자릿수의 합은 : "+sum);
	
}

public void method3() {
	
	while(true) {
		System.out.println("1. 계속");
		System.out.println("2. 종료");
		int num= sc.nextInt();
		if(num==1) {
			continue;
		}
		if(num==2) {
			break;
		}
	}
	System.out.println("프로그램이 종료되었습니다.");
	
}

public void method2() {
	
	int i=1;
	while(i>0) {
		i++;
		System.out.println(i);
	}
}

public void method1() {
	// while문
	
	for(;true;) {
		System.out.println("a");
	}
	
//	while(true) {
//		System.out.println("a");
//		break;
//	}
}

}
