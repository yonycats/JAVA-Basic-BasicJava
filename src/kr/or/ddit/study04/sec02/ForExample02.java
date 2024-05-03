package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	ForExample02 obj = new ForExample02();
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
	// 구구단 출력해보기
	
	for(int i=1; i<=9; i++) {
//		System.out.println("===="+(i)+"단====");
		for(int j=2; j<=9; j++) {
			System.out.print(j+"*"+i+"="+j*i+"\t");
		} System.out.println();
	}
	
	
//	for(int i=2; i<=9; i++) {
//		System.out.println("===="+i+"단====");
//		for(int j=1; j<=9; j++) {
////			System.out.println(i+"*"+j+"="+i*j+"\t");
//			System.out.printf("%d * %d = %d\n", i,j,i*j);
//		} System.out.println();
//	}
}

public void method5() {
	// END는 특별한 의미가 없는 내가 지정한 단어일 뿐임
	
	END:
	for(int i=0; i<100; i++) {
		for(int j=0; j<100; j++) {
			System.out.println(i+", "+j);
			if(i==30 && j==30) {
				break END;
			}
		}
	}
	
}

public void method4() {
	// i가 30, j가 30일 때부터, 더 이상 출력하지 않고 종료
	
	boolean flag =  true;
	for(int i=0; i<100; i++) {
		for(int j=0; j<100; j++) {
			if(flag) {
				System.out.println(i+", "+j);
			}
			if(i==30 && j==30) flag = false;
		}
	}
	
}

public void method3() {
	// break문
	// 반복문을 종료시킴
	
	for(char ch='a'; ch<='z'; ch++) {
		if(ch=='o') break;
		System.out.print(ch);
	}
}

public void method2() {
	// 영어를 입력하고 모음을 제거하시오. a, i, o, e, u
	// abcde -> edcba
	String word = sc.next();
	
	for(int i=0; i<word.length(); i++) {
		char ch = word.charAt(i);
		if(ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u') continue; {
			System.out.print(ch);
		}
	}
}

public void method1() {
	// continue 문
	// continue를 만나면 바로 밑으로 가지 않고 통과함
	// 해당 loop를 종료시키고 다음 loop를 진행시킴
	
	for(int i=0; i<10; i++) {
		if(i%2==0) continue;
		System.out.println(i);
	}
}

}
