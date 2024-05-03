package kr.or.ddit.study02.sec03;

public class TypeChange2 {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 86;
		int math = 80;
		
		// 총점과 평균을 출력하시오.
		int sum = kor+eng+math;
		
		int avg1 = sum/3;
		double avg2 = (double)sum/3;
		double avg3 = sum/3.0;		
		
		System.out.println("총점 : "+sum+", 평균 : "+avg1);
		System.out.println("평균 : "+avg1);
		System.out.println("평균 : "+avg2);
		System.out.println("평균 : "+avg3);
	}
}
