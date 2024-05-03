package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType2 obj = new ReferenceType2();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
	}
	
	public void method2() {
//		String a = "";
		
		// 참조 변수는 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있음
		String a = null;
		
		// 앞이 값이 있고, ||이기 때문에 실행됨
//		if(a==null || a.isEmpty()) {
//			System.out.println("빈 문자열");
//		}
		
		// 앞이 비어있음 = 거짓이기 때문에 실행되지 않음
		if(a.isEmpty() || a==null) {
			System.out.println("빈 문자열");
		}
		
		
	}
	
	public void method1() {
		int a = 10;
		// 1번
		int b = 15;

		{
			// 2번
			String c = "test";
		}
		// 4번
		String d = "test";
		
		{
			int e = 4;
			// 5번
			{
				int f = 10;
				// 6번
			}
			int g = 3;
			// 7번
			d = "test2";
			// 8번
		}

		
	}

}
