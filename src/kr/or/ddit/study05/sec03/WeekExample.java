package kr.or.ddit.study05.sec03;

import java.util.Scanner;

/**@since 2024.04.23
 * @author 김연희
 *@version 1.8
 */
public class WeekExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WeekExample obj = new WeekExample();
		obj.process();
	}

	
	public void process() {
		week(3);
		week(Week.SAT);
	}

	
	public void week(Week week) {
//		if(week==Week.SUN) System.out.println("일요일");
//		if(week==Week.MON) System.out.println("월요일");
//		if(week==Week.TUE) System.out.println("화요일");
//		if(week==Week.WED) System.out.println("수요일");
//		if(week==Week.THU) System.out.println("목요일");
//		if(week==Week.FRI) System.out.println("금요일");
//		if(week==Week.SAT) System.out.println("토요일");
		// enum 타입을 활용하면 위의 긴 코드가 아래 1줄로 줄여짐
		// 잘 사용하지는 않음
		System.out.println(week.day);
	}
	
	
	
	// 아래 주석 단축키 => 해당 메서드나 단어 드래그 + Alt+Shift+J
	// 파라미터를 사용할 때 설명이 보이게 하는 주석
	/**
	 * @param num 1 = 일요일 2 = 월요일
	 */
	public void week(int num) {
		// 요일 출력하기
		// 자바 상수
		if(num==1) System.out.println("일요일");
		if(num==2) System.out.println("월요일");
		if(num==3) System.out.println("화요일");
		if(num==4) System.out.println("수요일");
		if(num==5) System.out.println("목요일");
		if(num==6) System.out.println("금요일");
		if(num==7) System.out.println("토요일");
	}
	
}
