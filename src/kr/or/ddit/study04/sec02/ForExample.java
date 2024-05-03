package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
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
		method9();
//		method10();
//		method11();
	}
	
	public void method11() {
		// for 문을 이용해서 문자를 입력받고 숫자를 제거하시오.
		System.out.println("문자를 입력하세요.");
		String word = sc.next();
		
		for(int i=0; i<word.length(); i++) {
			char ch =  word.charAt(i);
			if(ch>='0' && ch<='9') {
			} else {
				System.out.print(ch);
			}
		}
		
	}
	
	public void method10() {
		// 영어를 입력하고 모음을 제거하시오.
		// abcde -> bcd
		// 모음 a e i o u
		System.out.println("문자를 입력하세요.");
		String word = sc.next();
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			} else {
				System.out.println(word.charAt(i));
			}
		}
		
		// 입력받은 문자를 하나씩 출력
		for(int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		

		
	}
	
	public void method9() {
		// 문자열을 거꾸로 출력하기
		System.out.println("문자를 입력하세요.");
		String word = sc.next();
		
		for(int i=word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
		}
	}
	
	public void method8() {
		// 입력받은 문자열을 한단어씩 출력하기
		System.out.println("단어를 입력하세요");
		String word = sc.next();
		for(int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
	}
	
	public void method7() {
		// 숫자를 입력받고 1~ 해당 숫자까지의 총합
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		} System.out.println(sum);
		
	}
	
	public void method6() {
		// 소문자를 입력받고 해당 문자부터 ~z까지 출력하시오.
		System.out.println("소문자를 입력하세요.");

//		for(int i=ch.charAt(0); i<='a'+25; i++) {
//			System.out.print((char)i+" ");
//		}
		
//		for(char i=ch.charAt(0); i<='z'; i++) {
//			System.out.print(i+" ");
		
		// 문자열 입력 받기
		String s = sc.next();
		
		// 문자열 -> 문자
		char ch = s.charAt(0);
		
		// for문 작성
		for(; ch<='z'; ch++) {
		System.out.print(ch);
		}
	}
	
	public void method5() {
		// a~z까지 출력해보기
		
		for(char i='a'; i<='z'; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i='a'; i<='a'+25;i++) {
			System.out.print((char)i+" ");
		}
		
		System.out.println();
		
		for (int i=97; i<=122; i++) {
			System.out.print((char)i+" ");
		} 
	}
	
	public void method4() {
		// 연산에 있어서 5번만 연산을 도는 1번이 더 효율적인 코드
		
		// 1~10까지 짝수의 합을 구하시오.
		int sumEven = 0;
		for (int i=2; i<=10; i=i+2) {
			sumEven=sumEven+i;
		} System.out.println("1부터 10까지 짝수의 총합은 : "+sumEven);
		
		
//		for (int i=0;i<=10; i++) {
//			if (i%2==0) {
//				sumEven+=i;
//			}
//		} System.out.println("1부터 10까지 짝수의 총합은 : "+sumEven);
		
	}
	
	public void method3() {
		// 1~10까지 홀수의 합을 구하시오.
		int sumOdd = 0;
		
		for (int i=0;i<=10;i++) {
			if (i%2!=0) {
				sumOdd=sumOdd+i;
			} 
		} System.out.println("1부터 10까지 홀수의 총합은 : "+sumOdd);
	}
	
	public void method2() {
		// 5~10까지의 합을 구하시오.
		int sum=0;
		for (int i=5; i<=10; i++) {
			sum=sum+i;
		} System.out.println(sum);
	}

	public void method1() {
		//
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		int i4 = 4;
		int i5 = 5;
		
		int sum = i1+i2+i3+i4+i5;
		int sum2 = 0;
		
		// int i=1 	-> '초기화 식'이라고 함
		// i<=5; 	-> 조건식
		// i++	 	-> 증감식
		// for(int i=1; i<=5; i++)
		for(int i=1; i<=5; i++) {
			sum2=sum2+i;
		} System.out.println("1~5까지의 합 : "+sum2);
		
	}
}
