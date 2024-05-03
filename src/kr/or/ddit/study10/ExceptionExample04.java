package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample04 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample04 obj = new ExceptionExample04();
		obj.process();
	}

	public void process() {
		try {
			int sel = sc.nextInt();
			method1(sel);
		} catch (Exception e) {
			System.out.println("에러 발생");
		}

	}
	
	String[] names = { "홍길동", "이순신", "강감찬" };
	
	// throws Exception : 해당 메서드 또는 클래스에서 해결 불가능한 예외는 위로(불러온 곳으로) 던짐
	public void method1(int num) throws Exception {
		System.out.println(names[num]);
	}

}
