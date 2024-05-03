package kr.or.ddit.study02.sec03;

public class TypeChange5 {
	public static void main(String[] args) {
		// 소수점 버림
		double d = 10.1231;
		System.out.println(d);
		
		int i10 = (int)(d*10);
		
		// 소수점 첫째자리까지 출력
		double d10 = (double)i10/10;
		double d20 = i10/10.0;
		System.out.println(d10);
		System.out.println(d20);
		
		// 소수점 둘째자리까지 출력
		int i100 = (int)(d*100);
		
		double d100 = (double)i100/100;
		double d200 = i100/100.0;
		System.out.println(d100);
		System.out.println(d200);
	}
}
