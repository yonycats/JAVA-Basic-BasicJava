package kr.or.ddit.study02.sec02;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
	// 문자와 문자열
	// 문자(char)		: 한글자로 '' 묶어서 선언
	// 문자열(String) : 복수개의 글자로 구성된 자료(기본타입은 아님)
	//					""로 묶어서 사용
	
	String name = "홍길동";
	String name2 = new String("김길동");
	
//	System.out.println(name);
//	System.out.println(name2+"\n"+name2);
//	System.out.println(name2+"\r"+name2);
//	System.out.println(name2+"\r\n"+name2);
	
	// \n	: 개행문자(Enter)
	// \r	: 개행문자(Enter)
	// \r\n	: 개행문자(Enter)
	
	// \t	: 탭
	// \\	: 역슬러시 출력
	// \"	: 큰 따옴표 출력
	// \'	: 작은 따옴표 출력
	
	int a1 = 20;
	int a2 = 24;
	// a1과 a2를 이용해서 2023 출력해보기
	String result3 = a1+a2+"";
	String result4 = ""+a1+a2;
	
	System.out.println(result3);
	System.out.println(result4);
	System.out.println("a1+a2="+(a1+a2));
	System.out.println("a1+a2="+result4);
	}
}
