package kr.or.ddit.study06.sec03;

public class ScoreExample {
	public static void main(String[] args) {
		
		// 인자가 3개인 생성자로 연결됨
		Score s1 = new Score(74, 67, 81);
		System.out.println(s1);
		
		
		// 인자가 없는 기본 생성자로 연결됨
		Score s2 = new Score();
		s2.kor = 74;
		s2.eng = 67;
		s2.math = 81;
		s2.avg = (s2.kor + s2.eng + s2.math)/3.0;
		System.out.println(s2);
		
	}

}
