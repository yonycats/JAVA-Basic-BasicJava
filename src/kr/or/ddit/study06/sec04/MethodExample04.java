package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample04 obj = new MethodExample04();
		obj.process();
	}

	public void process() {
		// 스캐너를 통해 a, b 값을 입력받고
		// add 메소드를 수정하여 a+b 값을 리턴받아 출력하시오

		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.print("b : ");
		int b = sc.nextInt();
		
		
		
		int add = add(a,b);
		System.out.println(a+" + "+b+" = "+add);
		
		int substraction = substraction(a,b);
		System.out.println(a+" - "+b+" = "+substraction);
		
		int multiplication = multiplication(a,b);
		System.out.println(a+" * "+b+" = "+multiplication);
		
		double division = division(a,b);
		System.out.println(a+" / "+b+" = "+division);
	}

	public int add(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		return Math.round(a/b*10)/10.0;
	}
	
}
