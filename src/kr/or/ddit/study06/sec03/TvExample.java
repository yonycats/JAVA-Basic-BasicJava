package kr.or.ddit.study06.sec03;

import java.util.Arrays;

public class TvExample {
	public static void main(String[] args) {
		
		// 값을 넣는 방식
		
		// 1.
		int b = 10;
		Tv tv1 = new Tv("LG", 60);
		System.out.println(tv1.company+", "+tv1.size);
		
		
		// 2.
		int a;
		a = 10;
		Tv tv2 = new Tv();
		tv2.company = "삼성";
		tv2.size =65;
	}
	

}
