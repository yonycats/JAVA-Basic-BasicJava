package kr.or.ddit.study10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample03 {

	public static void main(String[] args) {
		ExceptionExample03 obj = new ExceptionExample03();
		obj.process();
	}

	public void process() {

		String[] name = { "홍길동", "이순신", "강감찬" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(i + ". " + name[i]);
		}

		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("0~2 사이의 번호를 고르시오.");
			try {
				int sel = sc.nextInt();
				if (sel < 0 || sel >= name.length) {
					System.out.println("배열 범위를 벗어남");
					continue;
				}
				String n = name[sel];
				System.out.println(n);
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("배열 범위를 벗어남");
				e.printStackTrace();
			}
		}
		
		
		
	}
}
