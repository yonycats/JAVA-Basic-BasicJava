package kr.or.ddit.study06.sec05;

import java.util.Date;

public class BigLoadExample {
	public static void main(String[] args) {
		Date d1 = new Date(); 
		
		// 프라이빗이라 안만들어짐
		// 아래 방식은 생성자가 public일 때 아래 방식 사용가능
//		BigLoad b1 = new BigLoad();
//		BigLoad b2 = new BigLoad();
//		BigLoad b3 = new BigLoad();
		
		// 호출하는 대체방법
		BigLoad b1 = BigLoad.getInstance();
		BigLoad b2 = BigLoad.getInstance();
		BigLoad b3 = BigLoad.getInstance();
		
		Date d2 = new Date(); 
		System.out.println(d2.getTime() - d1.getTime());
		
		
		
	}
}
