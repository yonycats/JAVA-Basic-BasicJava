package kr.or.ddit.study11;

import java.util.Scanner;

public class StringExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
	}
	
	public void method9() {
		System.out.println("계속 하시겠습니까(y/n)");
		String yn = sc.next();
		
		// 문자 비교시, 대문자와 소문자를 구별하지 않음
		// DB에서 데이터가 넘어올 때, 대문자인 경우가 있는데 그 때 사용할 수 있음
		if(yn.equalsIgnoreCase("y")) {
			System.out.println("계속");
		}
		else if(yn.equals("n")) {
			System.out.println("종료합니다.");
		}
		
		
//		if(yn.equals("y")) {
//			System.out.println("계속");
//		}
//		else if(yn.equals("n")) {
//			System.out.println("종료합니다.");
//		}
		
	}
	
	public void method8() {
		String str = null;
		
//		if(str == null || str.isEmpty()) {
//			System.out.println("빈 문자열");
//		}
		
		if(str.isEmpty() || str == null) {
			System.out.println("빈 문자열");
		}
		
	}

	public void method7() {
		String test = "문자열 test 입니다.";
		if (test.contains("test")) {
			System.out.println("test 문자가 포함되어 있다.");
		}
	}

	public void method6() {
		String str = "Book1.csv";
		if (str.startsWith("Book1")) {
			System.out.println("Book1로 시작합니다.");
		}
		if (str.endsWith(".csv")) {
			System.out.println(".csv로 끝납니다.");
		}

	}

	public void method5() {
		// str = str.substring(2, 5);
		// 2번 인덱스에서 5번 인덱스까지 자름
		String str = "123456";
		str = str.substring(2, 5);
		System.out.println(str);
	}

	public void method4() {
		String str = "000 바보 바보 바보";
		str = str.replace("바보", "*");
		System.out.println(str);
	}

	public void method3() {
		String space = "  a b c  ";
		space = space.trim();
		System.out.println(space);
	}

	public void method2() {
		String test = "a,b,c";
		String[] tokens = test.split(",");
		
		// 결과   =>  문자열 안에 공백이 있기 때문에 공백이 함께 나옴
		for(String token : tokens) {
			token = token.trim();
			System.out.println(token);
		}
	}
	

	public void method1() {
		String test = "abcd";
		
		if(test.equals("abcd")) {
			System.out.println("같다");
		}
		
		// 영어를 대문자로 바꾸기
		test = test.toUpperCase();
		System.out.println(test);
		
		// 영어를 소문자로 바꾸기
		test = test.toLowerCase();
		System.out.println(test);

	}

}
