package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample02 obj = new MethodExample02();
		obj.process();
	}

	public void process() {
		// 스캐너를 통해 a, b 값을 입력받고
		// add 메소드를 수정하여 a+b 값을 출력하시오
		
		System.out.print("숫자를 입력하세요. a = ");
		int a = sc.nextInt();
		System.out.print("숫자를 입력하세요. b = ");
		int b = sc.nextInt();
		
		addition(a,b);
		subtraction(a,b);
		multiplication(a,b);
		division(a,b);
		
	}
	
	public void addition(int c, int d) {
		System.out.println("a+b = "+(c+d));
	}

	public void subtraction(int c, int d) {
		System.out.println("a-b = "+(c-d));
	}
	
	public void multiplication(int c, int d) {
		System.out.println("a-b = "+(c*d));
	}
	
	public void division(int c, int d) {
		System.out.println("a-b = "+(c/d));
	}
}
