package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample06 obj = new MethodExample06();
		obj.process();
	}

	public void process() {
		
		// 배열 메서드 인자 넣기, 배열 메서드 사용하기
		int[] arr = {1,2,3};
		method1(arr);
		
//		method2(arr);
		method2(1, 3, 5, 7, 9);
	}

	public void method1(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	// 배열의 길이를 알수 없을 때 ...으로 배열의 인자를 넣을 수도 있음
	public void method2(int... arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public void method3() {

	}
}
