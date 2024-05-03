package kr.or.ddit.study07.sec01;

import java.util.Scanner;

public class PhoneMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneMain obj = new PhoneMain();
		obj.process();
	}

	public void process() {
		// 상속
		// final 클래스는 상속받을 수 없음(부모 클래스로 사용할 수 없음)
		// final 변수는 자식 클래스에서 재정의할 수 없음
		Phone phone = new Phone();
		phone.tell();
		
		System.out.println();
		
		DmbPhone dmbPhone = new DmbPhone();
		dmbPhone.tell();
		dmbPhone.dmb();
		
		System.out.println();
		
		IPhone iPhone = new IPhone();
		iPhone.tell();
		iPhone.camera();
		
		System.out.println();
		
		IPhone2 iPhone2 = new IPhone2();
		iPhone2.camera();
		
	}

}
