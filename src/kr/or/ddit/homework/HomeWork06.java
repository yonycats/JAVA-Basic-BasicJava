package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	HomeWork06 obj = new HomeWork06();
	obj.process();
}

public void process() {
//	method1();
//	method2();
//	method3();
	method4();
}

public void method4() {
	// 양의 정수 n이 매개변수로 주어질 때
	// n이 홀수라면 n 이하의 홀수인 모든 양의 정수 합
	// -> n = 5
	//	  1 + 3 + 5 = 9
	// n이 짝수라면 n 이하의 짝수인 모든 양의 정수제곱의 합
	// -> n = 4
	//    2*2 + 4*4 = 20
//	int n = (int)(Math.random()*100)+1;
	
	System.out.println("숫자를 입력하세요.");
	int n = sc.nextInt();
	
	int sum = 0;
	
	if (n%2==1) {
		while(n>0) {
			sum=sum+n;
			n=n-2;
		} System.out.println(sum);
	} 
	else if (n%2==0) {
		while(n>0) {
			sum=sum+(n*n);
			n=n-2;
		} System.out.println(sum);
	} 
	
	
	
	
//	if (n%2==1) {
//		for(int i=1; i<=n; i+=2) {
//			sum+=i;
//		}
//	} 
//	else {
//		for(int i=2; i<=n; i+=2) {
//			sum+=i*i;
//		}
//	} 

	
}

public void method3() {
	// for문 2개를 이용하여 구구단 전체를 출력하시오.
	// 스캐너를 통해 숫자를 입력받고 해당 숫자에 해당하는 구구단은 제외한 후 출력하시오.
	// 출력 순서 방식은 method2와 같음.
	System.out.println("제외할 숫자를 입력하세요.");
	int num = sc.nextInt();
			
		
	for(int i=1; i<=9; i++) {
		for(int j=2; j<=9; j++) {
			if(j==num) continue;{
			System.out.print(j+"*"+i+"="+i*j+"\t");
			}
		} System.out.println();
	} 
}

public void method2() {
	
	// for문 2개를 이용하여 구구단 전체를 출력하시오.
	// 2*1 =2 3*1 =3 4*1 =4 5*1 =5  6*1 =6  7*1 =7  8*1 =8  9*1 =9 
	// 2*2 =4 3*2 =6 4*2 =8 5*2 =10 6*2 =12 7*2 =14 8*2 =16 9*2 =18
	// 2*3 =6 ...순으로
	
	for(int i=1; i<=9; i++) {
		for(int j=2; j<=9; j++) {
			System.out.print(j+"*"+i+"="+i*j+"\t");
		} System.out.println();
	} 
	
}

public void method1() {
	// 스캐너를 통해 숫자를 입력받고 해당 숫자에 해당하는 구구단을 출력하시오.
	// 2~9 외에 다른 숫자 입력시에는 '다른 숫자를 입력해주세요' 를 출력
	/*
	 * 3*1 =3; 
	 * 3*2 =3; 
	 * 3*3 =3; 
	 * 3*4 =3; 
	 * 3*5 =3; 
	 * 3*6 =3; 
	 * 3*7 =3; 
	 * 3*8 =3; 
	 * 3*9 =3;
	 */
	System.out.println("숫자를 입력해주세요.");
	int num = sc.nextInt();
	
	if(num>=2 && num<=9) {
		for (int i=1; i<=9;i++) {
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}
	else {
		System.out.println("다른 숫자를 입력해주세요.");
	}
	
}

}
