package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}


	public void process() {
		// 각각에 값 입력
		Score s1 = new Score();
		
		s1.name = "고현";
		s1.kor = 80;
		s1.eng = 70;
		s1.math = 63;
		
		Score s2 = new Score();
		s2.name = "권협";
		s2.kor = 90;
		s2.eng = 85;
		s2.math = 90;
		
		Score s3 = new Score();
		s3.name = "이준";
		s3.kor = 90;
		s3.eng = 70;
		s3.math = 75;
		
		Score s4 = new Score();
		s4.name = "리오";
		s4.kor = 65;
		s4.eng = 75;
		s4.math = 70;
		
		Score s5 = new Score();
		s5.name = "새별";
		s5.kor = 77;
		s5.eng = 80;
		s5.math = 70;
		
//		Score temp = new Score(); 
		
		
		// scores가 한명에 대한 점수, 배열을 사용해서 여러명의 값을 사용
		Score[] scores = {s1, s2, s3, s4, s5};
		// 1. 총점/평균
		for(int i=0; i<scores.length; i++) {
			scores[i].sum = scores[i].kor+scores[i].eng+scores[i].math;
		}
		for(int i=0; i<scores.length; i++) {
			scores[i].avg = Math.round(((double)(scores[i].kor+scores[i].eng+scores[i].math)/3.0)*10)/10.0;
		}
		
		
//		// 선생님꺼
//		for(Score s: scores) {
//			s.sum = s.kor + s.eng + s.math;
//			s.avg = s.sum/3.0;
//		}
//		for(int i=0; i<scores.length; i++) {
//			for (int j=0; j<scores.length; j++) {
//				if (scores[i].sum<scores[j].sum) {
//					scores[i].rank++;
//				}
//			}
//		}
		
		
		
		// 2. 등수 구하기
		for (int i=0; i<scores.length; i++) {
			for (int j=0; j<scores.length; j++) {
				if(scores[i].sum < scores[j].sum) {
					scores[i].rank++;
				}
			}
		}
		
		
		// 3. 출력
//		for (int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//		System.out.println();
		
		
//		for(Score s : scores) {
//			System.out.println(s);
//		}
		
		
		// 4. 정렬
		
//		// 1) 상위에  Score temp = new Score(); 를 만들었을 경우 코드
//		for (int i=0; i<scores.length-1; i++) {
//			for (int j=0; j<scores.length-1; j++) {
//				if (scores[j].rank>scores[j+1].rank) {
//					temp = scores[j];
//					scores[j] = scores[j+1];
//					scores[j+1] = temp;
//				}
//			}
//		}
		
		
		// 2) 상위에  Score temp = new Score(); 를 만들지 않았을 경우 코드
		for (int i=0; i<scores.length-1; i++) {
			for (int j=0; j<scores.length-1; j++) {
				if (scores[j].rank>scores[j+1].rank) {
					Score temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
				}
			}
		}
		
		
		// 5. 출력
		
		for (Score str : scores) {
			System.out.println(str);
		}
		
//		for (int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
	}
}

class Score{
	// 필드 만들기
	// 이름 국영수 총점 평균 등수
	String name;
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg0;
	double avg = Math.round(avg0);
	int rank = 1;
	
	
	
	// 출력하기
	// toString 만들기
	@Override
	public String toString() {
		
		return name+"의 점수는 국어 : "+kor+"점, 영어 : "+eng+"점, 수학 : "+math+"점이고, "
				+"총점은 : "+sum+"점, 평균은 : "+avg+", 등수는 "+rank+"등 입니다.";
	}
	
	
}
