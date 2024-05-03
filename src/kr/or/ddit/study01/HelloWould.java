package kr.or.ddit.study01;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class HelloWould {
	public static void main(String[] args) {
		System.out.println("이름을 입력하세요.");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();
		
		System.out.println("나이를 입력하세요.");
		Scanner scan2 = new Scanner(System.in);
		int age = scan2.nextInt();
		
		System.out.println("교육생님의 이름은 "+name+"이며, 나이는 "+age+"살 입니다.");
		
	}
}
