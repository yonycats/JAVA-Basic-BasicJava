package kr.or.ddit.study06.sec06;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person p1 = new Person();
//		private 필드로 만들면 접근이 안됨
//		p1.name = "이름";
		
		int age = sc.nextInt();
		// private 데이터 입력
		p1.setAge(age);
		// private 데이터 가져오기
		p1.getAge();
		
		
//		// private 필드로 만들면 접근이 안됨
//		int age = sc.nextInt();
//		p1.age = age;
//		if(age<0) {
//			System.out.println("유효한 나이를 입력해주세요");
//		} else {
//			p1.age = age;
//		}
		
		
	}

}
