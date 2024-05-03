package kr.or.ddit.homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();
	}

	public void process() {
		// Calendar.getInstance(); => 현재의 날짜
		Calendar cal = Calendar.getInstance();

		
		while(true) {
			// < 이전달	다음달 >
			// 맨 처음 날짜를 1일로 바꿈
			cal.set(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
//			System.out.println("요일 " + day);
			
			// 이번달의 첫번째 일
			int firstDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
//			System.out.println(firstDay);
			
			// 이번달의 마지막 일
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//			System.out.println(lastDay);
			
			
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			
//			System.out.println("=================== "+ year + "년 " + month + "월" + "  =====================");
//			System.out.println("< 이전달\t\t\t\t\t         "+"다음달 >");
//			System.out.println("일\t"+"월\t"+"화\t"+"수\t"+"목\t"+"금\t"+"토\t");
//			System.out.println("--------------------------------------------------");
//			
//			// 주차 바꾸는 용도
//			int cnt = 0;
//			
//			// 공백 출력하는 용도 & cnt값++
//			for (int i=1; i<day; i++) {
//				cnt++;
//				System.out.print("\t");
//			}
//			
//			// 주차 바꾸는 용도의 cnt값++ & 첫번째 날짜부터++을 해서 날짜 입력
//			for (int i=0; i<lastDay; i++) {
//				cnt++;
//				System.out.print(firstDay++ +"\t");
//				// cnt값이 7의 배수가 될 때마다 주차 이동 
//				if (cnt%7 == 0) {
//					System.out.println();
//				}
//			} System.out.println();
//			
//			
//			
//			// <, > 입력
//			String str = sc.next();
//			
//			// 월 이동
//			if(str.equals("<")) {
//				cal.add(Calendar.MONTH, -1);
//			} else if (str.equals(">")) {
//				cal.add(Calendar.MONTH, 1);
//			}
			
			
			
			
			// 선생님 방법
			System.out.println("=================== "+ year + "년 " + month + "월" + "  =====================");
			System.out.println("< 이전달\t\t\t\t\t         "+"다음달 >");
			System.out.println("일\t"+"월\t"+"화\t"+"수\t"+"목\t"+"금\t"+"토\t");
			System.out.println("--------------------------------------------------");
			
			cal.set(Calendar.DATE, 1);
			day = cal.get(Calendar.DAY_OF_WEEK);
			for (int i=1; i<day; i++) {
				System.out.print("\t");
			}
//			
//			// 이번달의 마지막 일
			for (int i=1; i<=lastDay; i++) {
				int weekDay = cal.get(Calendar.DAY_OF_WEEK);
				System.out.print(i+"\t");
				// 주 차 바꾸기
				if(weekDay == 7) {
					System.out.println();
				}
			    // 
				if (i!=lastDay) cal.add(Calendar.DATE, 1);
			}
//			
//			
			String str = sc.next();
//			if(str.equals("<")) cal.add(Calendar.MONTH, -1);
//			if(str.equals(">")) cal.add(Calendar.MONTH, 1);
			
			
		}
	}
}