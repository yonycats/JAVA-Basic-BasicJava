package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.process();
	}

	public void process() {
		method1();
	}

	public void method1() {
		// 삼항 연산자 : 3개의 피연산자를 필요로 하는 연산
		
//		String str = true ? "참":"거짓";
//		System.out.println(str);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
//		
		System.out.println(age);
		
		// 3항 연산자를 이용해서
		// 18세 이상이면 성년 아니면 미성년자를 저장하시오.
//		String adult = (Integer.valueOf(age)>=18)?"성년":"미성년";
		
		// adult에는 int 값이 들어가는데, aa에는 int 값이 안들어가는 이유
		// 삼항 연산자의 [age>=18?"성년":"미성년";] 에서의 조건 부분은 타입 상관없이
		// 앞과 뒤의 타입이 같기만 하면 됨.
		// String aa = age;
		
		String adult = age>=18?"성년":"미성년";
		System.out.println(adult);
		
		
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		int b = sc.nextInt();
		// a값 짝수라면 a+b
		//	    홀수라면 a*b
		int result = (a%2)==0?a+b:a*b;
		System.out.println(a+", "+b+" =>"+result);
		
	}
}
