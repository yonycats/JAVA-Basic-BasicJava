package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DateExample obj = new DateExample();
		obj.process();
	}

	public void process() {
//		Method1();
//		Method2();
//		Method3();
//		Method4();
//		Method5();
		Method6();
	}
	
	public void Method6() {
		// 싱글톤 패턴임
		Calendar cal = Calendar.getInstance();
		
		// field : Calendar.더할 값의 메서드, amount : 변경할 값
		// 날짜는 DATE, 달은 MONTH, 년도는 YEAR
		cal.add(Calendar.YEAR, 1);
		// MONTH은 0부터 시작함, 주의
		cal.set(Calendar.MINUTE, 30);
		
		Date date = cal.getTime();
//		System.out.println(date);
		
		// 연도 가져오기
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
	}
	
	
	public void Method5() {
		Date date = new Date();
		System.out.println(date);
		
		// 1분 뒤 시간 출력 (1000밀리세컨드*60)
		Date date2 = new Date(date.getTime()+1000*60);
		System.out.println(date2);
		
		System.out.println();
		
		// 100일 뒤 시간 출력
		System.out.println("더할 날짜를 입력하세요.");
		int day = sc.nextInt();
		
		// int 타입을 넘어서서 정상값으로 나오지 않음
//		Date date3 = new Date(date.getTime()+1000*60*60*24*day);
		// long 타입으로 수정본
		Date date3 = new Date(date.getTime()+1000l*60*60*24*day);
		System.out.println(date3);
	}
	
	
	public void Method4() {
		// 날짜를 String으로 입력받고
		// 몇일 몇분 몇초가 남았는지 출력하시오
		System.out.println("날짜를 입력하시오");
		String str = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date cur = new Date();
			Date date = sdf.parse(str);
			long time = date.getTime() - cur.getTime();
			int sec = 1000;
			int min = sec*60;
			int hour = min*60;
			int day = hour*24;
			
			long days = time/day;
			time %= day;
			
			long hours = time/hour;
			time %= hour;
			
			long mins = time/min;
			time %= min;
			
			long secs = time/sec;
			time %= sec;
			
			System.out.println(days + "일 " + hours + "시 " + mins + "분 " + secs + "초 남았습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void Method3() {
		// 문자 타입을 Date 날짜 타입으로 바꾸는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String str = "2024.04.30";
		// 빨간줄 -> Surround with try/catch 클릭 
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void Method2() {
		// Date -> String
		// date2String
		
		// HH는 24시간 기준, hh는 12시간 기준
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd a HH:mm:ss");
		Date date = new Date();
		
		// Date 날짜 타입을 문자로 바꾸는 방법
		String str = sdf.format(date);
		System.out.println(str);
	}
	
	
	public void Method1() {
		// Date 임포트는 util로 해야함
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println(time);
		
		// 몇년 몇일 몇시 몇분 몇초
		int sec = 1000;
		int min = sec*60;
		int hour = min*60;
		int day = hour*24;
		int year = day*365;
		
		int years = (int)(time/year);
		time%=year;
	}
	
}
