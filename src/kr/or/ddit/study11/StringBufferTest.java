package kr.or.ddit.study11;

import java.util.Date;
import java.util.Scanner;

public class StringBufferTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringBufferTest obj = new StringBufferTest();
		obj.process();
	}

	public void process() {
		Date d1 = new Date();
//		method1(100000);
		method2(100000);
		Date d2 = new Date();
		System.out.println(d2.getTime()-d1.getTime());
	}
	
	// 힙에서 메서드 소요시간 체크 => str에 직접적으로 더하는 건 좋지 않음, 오래걸림
	public void method1(int num) {
		String str = "";
		for (int i=0; i<num; i++) {
			str+="a";
		}
	}
	
	// 소요시간이 훨씬 적음
	// StringBuffer를 사용해서 데이터를 넣을 것 => append 사용
	public void method2(int num) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<10; i++) {
//			sb.append("a");
			sb.append(i);
		}
		sb.reverse(); // 순서 뒤집기
		System.out.println(sb.toString());
	}
	

}
