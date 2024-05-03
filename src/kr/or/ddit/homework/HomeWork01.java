package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		Date date = new Date();
	
		// 기준일(1970년 1월 1일(영국기준시))로부터 지난 시간을
		// 밀리세컨드(1000분의 1초)로 반환해주는 함수
		long time = date.getTime();
		// System.out.println(time);
		
		// 과제 : ?년 ?일 ?시 ?분 ?초 지났습니다.

		long year = time/1000/60/60/24/365;
		long day = time/1000/60/60/24;
		long hour = time/1000/60/60;
		long minute = time/1000/60;
		long second = time/1000;
		
		long yearValue = time/1000/60/60/24/365;
		long dayValue = day-(year*365);
		long hourValue = hour-(day*24);
		long minuteValue = minute-(hour*60);
		long secondValue = second-(minute*60);

		
//		System.out.println("년 "+year);
//		// *윤년 계산용* = 월
//		System.out.println("월 "+month);
//		System.out.println("일 "+day);
//		System.out.println("시 "+hour);
//		System.out.println("분 "+minute);
//		System.out.println("초 "+second+"\n");
		
		// 과제문제 풀이
		System.out.println(yearValue+"년 "+dayValue+"일 "+hourValue+"시 "+minuteValue+"분 "+secondValue+"초 "+"지났습니다.");
	}
}
