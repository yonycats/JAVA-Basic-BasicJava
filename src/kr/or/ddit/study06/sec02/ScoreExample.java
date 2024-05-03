package kr.or.ddit.study06.sec02;

public class ScoreExample {
	public static void main(String[] args) {
		// 2명의 score 객체를 생성하고
		
		Score s1 = new Score(); 
		Score s2 = new Score(); 
		
		// 국영수 값을 각각 넣어보시오.
		s1.kor = 90;
		s1.eng = 70;
		s1.math = 84;
		
		s2.kor = 86;
		s2.eng = 60;
		s2.math = 100;
		
		// 평균 s1, s2
		s1.avg = (s1.kor+s1.eng+s1.math)/3.0;
		s2.avg = (s2.kor+s2.eng+s2.math)/3.0;
		
		System.out.println(s1.avg);
		System.out.println(s2.avg);
	}
}

