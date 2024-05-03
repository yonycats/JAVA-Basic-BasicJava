package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample01 obj = new ExceptionExample01();
		obj.process();
	}

	public void process() {
		int a = 10;
		int[] b = {1,2,0};

		try {
			System.out.println("출력");
			for(int i=-1; i<b.length; i++) {
				double result = a/b[i];
				System.out.println("결과 값 : "+result);
			}
		} 
		// 배열 예외가 발생했을 경우의 처리 (a/b[i]일 때, i를 -1로 초기화)
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 벗어남");
		}
		// 연산 예외가 발생했을 경우의 처리 (a/b일 때 a=10, b=0)
		catch (ArithmeticException e) {
			System.out.println("잘못된 숫자로 나눴습니다.");
		}
		// 예외가 발생했을 경우의 처리
		catch (Exception e) {
			// 에러 메시지의 내용이 궁금할 때 사용
			e.printStackTrace();
		}

		System.out.println("종료되었습니다.");

	}
	
	
	
	
	
//	// 예외처리 만들기
//	public void process() {
//		int a = 10;
//		int b = 0;
//
//		try {
//			System.out.println("출력");
//			double result = a/b;
//			System.out.println("결과 값 : "+result);
//		} catch (Exception e) {
//			System.out.println("잘못된 숫자로 나눴습니다.");
//			// 에러 메시지의 내용이 궁금할 때 사용
//			e.printStackTrace();
//		}
//		
//		System.out.println("종료되었습니다.");
//		
//	}


	

	
//	// ArithmeticException 산술 연산(주로 정수를 0으로 나눌 때) 예외 발생
//	public void process() {
//		int a = 10;
//		int b = 0;
//		
//		double result = a/b;
//		System.out.println("결과 값 : "+result);
//		
//		System.out.println("종료되었습니다.");
//	}

	
	
	
}
