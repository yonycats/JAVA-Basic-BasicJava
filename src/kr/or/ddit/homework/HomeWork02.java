package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
//		obj.mehtod4();
		obj.mehtod5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 */
		System.out.print("실수를 입력해주세요.");
		String str = sc.next();
		
		double dou = Double.valueOf(str);
		int num = (int)(dou*100);
		double result = (double)num/100;
				
		System.out.println("실수는 : "+result);
		
	}
	
	public void mehtod2() {
		/*
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex) A-> a  
		 */
		System.out.print("대문자를 입력 해주세요.");
		String s = sc.next();
		
		int num = s.charAt(0)+32;
		char ch = (char)num;
		System.out.println(ch);
		
		
	}
	public void mehtod3() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex) f-> F  
		 */
		System.out.print("소문자를 입력 해주세요.");
		String s = sc.next();
		
		int num = s.charAt(0)-32;
		char str = (char)num;
		System.out.println(str);
	}
	
	public void mehtod4() {
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 */
		System.out.print("세자리 숫자를 입력해주세요.");
		String s = sc.next();
		
		char ch1 = s.charAt(0);
		char ch2 = s.charAt(1);
		char ch3 = s.charAt(2);
		
		int num1 = Integer.valueOf(ch1)-48;
		int num2 = Integer.valueOf(ch2)-48;
		int num3 = Integer.valueOf(ch3)-48;
		
		int sum = num1+num2+num3;
		
		System.out.println(sum);
	}
	
	public void mehtod5() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 */
		
		// 소수점 2째 짜리에서 반올림  
//		double num = 12.4; 
//		int numInt = (int)num;
		// 12+((12.6-12)*2)=12+(0.6*2)=12+1.2=13.2 -> 13.2를 int형으로 바꿈 -> 13
		// 12+((12.4-12)*2)=12+(0.4*2)=12+0.8=12.8 -> 12.8을 int형으로 바꿈 -> 12
//		int numRound = numInt+(int)((num-numInt)*2);
//		System.out.println(numRound);
		
		System.out.print("실수를 입력해주세요.");
		String str = sc.next();
		
		// 메서드5 1번 풀이
//		double dou1 = Double.valueOf(str);
//		System.out.printf("실수는 : %2.1f", dou1);
		
		
		// 메서드5 2번 풀이
		// 값이 12.26일 때 -> (1220+(1226-1220)*2)/100
		double dou2 = Double.valueOf(str);
		
		// 1220 변수
		int numInt1 = (int)(dou2*10)*10;
		// 1226 변수
		int numInt2 = (int)(dou2*100);
		// 1220+((1226-1220)*2)=1234
		int numInt3 = numInt1+((numInt2-numInt1)*2);
		// 1234를 123으로 만들기
		int numInt4 = numInt3/10;
		
		// /10 -> 다시 소수점 1자리로 만들기
		double result = (double)numInt4/10;
		
		System.out.println(result);
		
		// 메서드5 간단 풀이, 소수점 1자리 반올림일 때
		// int num = (int)+0.5
		// 메서드5 간단 풀이, 소수점 2자리 반올림일 때
		// int num = (int)+0.05
	}
	
	
}
