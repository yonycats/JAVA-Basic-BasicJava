package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType obj = new ReferenceType();
		obj.process();
	}

	public void process() {
		// 스택 영역과 힙 영역의 값 비교
		int a = 10;
		int b = 11;
		String c = "abc";
		String d = "abc";
		
		method1();
	}
	
	public void method1() {
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동");
		String d = new String("강감찬");
		String e = new String("강감찬");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==d);
		// d와 e가 값이 다른 이유는, 값이 아니라 서로 다른 주소값이 참조되어 있기 때문 (주소값이 같지 않다.)
		System.out.println(d==e);
		
		// 서로 다른 주소값의 데이터를 비교하기 위한 함수
		System.out.println(b.equals(c));
		
	}

}
