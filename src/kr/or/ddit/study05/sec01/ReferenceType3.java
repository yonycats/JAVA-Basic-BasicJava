package kr.or.ddit.study05.sec01;

import java.util.Scanner;
import java.util.Stack;

import kr.or.ddit.study05.sec02.ArrayExample2;

public class ReferenceType3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample2 obj = new ArrayExample2();
		obj.process();
	}

	public void process() {
		method1();
	}
	
	public void method1() {
		int a = 10;
		// 1번
		{
			int b = 12;
			int[] c;
			// 2번
			c = new int[] {1,2,3};
			// 3번
		}
		// 4번
		String d = "test";
		// 5번
		{
			String[] e = new String[3];
			// 6번
			e[0] = d;
			//7번
			String f = "test2";
			// 8번
			e[1] = f;
			// 9번
			e[2] = "test";
			// 10번
		}
		
		
		
	}

}
