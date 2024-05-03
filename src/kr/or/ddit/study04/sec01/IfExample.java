package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	public void method6() {
		// 점수를 입력받고 학접을 출력하세요.
		// 90점 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 60 미만 F 
		// 끝자리가 
		// 0~2	-	,	3~6		0	,	7~9		+
		System.out.println("점수를 입력하세요 :");
		int score = sc.nextInt();
		
		
		if (score>=90) {
			if (score>=90 && score<93) {
				System.out.println("A-");
			} else if (score>=93 && score<97) {
				System.out.println("A0");
			} else if (score>=97 && score<=100) {
				System.out.println("A+");
			}
		} 
		if (score>=80) {
			if (score>=80 && score<83) {
				System.out.println("B-");
			} else if (score>=83 && score<87) {
				System.out.println("B0");
			} else if (score>=87 && score<90) {
				System.out.println("B+");
			}
		}
		if (score>=70) {
			if (score>=70 && score<73) {
				System.out.println("C-");
			} else if (score>=73 && score<77) {
				System.out.println("C0");
			} else if (score>=77 && score<80) {
				System.out.println("C+");
			}
		}
		if (score>=60) {
			if (score>=60 && score<63) {
				System.out.println("D-");
			} else if (score>=63 && score<67) {
				System.out.println("D0");
			} else if (score>=67 && score<70) {
				System.out.println("D+");
			}
		}
		if (score<60) {
			System.out.println("F");
		}
	}
	
	public void method5() {
		// 키와 체중을 입력하여 BMI 지수를 구하고
		// BMI 지수에 따른 정상, 과체중, 비만, 고도비만 정보를 출력하시오.
		// BMI 지수 = 체중(kg)/(키(m)*키(m))
		
		// 0~18.5 미만	: 저체중
		// 18.5~23 미만	: 정상
		// 23.0~25 미만	: 과체중
		// 25.0~30 미만 	: 비만
		// 30 이상		: 고도비만
		
		System.out.println("키를 입력하세요 : ");
		double height = sc.nextDouble();	
		System.out.println("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();	
		double bmi = weight/height/height;
		
		// 키 값이 100보다 크다면 100 나눠주기
		if (height>100) {
			height = height/100;
		}
		
		if (bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi>=18.5 && bmi<23) {
			System.out.println("정상");
		} else if (bmi>=23 && bmi<25) {
			System.out.println("과체중");
		} else if (bmi>=25 && bmi<30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
	}
	
	public void method4() {
		// 월을 입력 할 때 마다 봄(3~5) 여름(6~8) 가을(9~11) 겨울(11~2)를 출력하시오.
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		if (month==3 || month==4 || month==5 ) {
			System.out.println("봄");
		} else if (month==6 || month==7 || month==8 ) {
			System.out.println("여름");
		} else if (month==9 || month==10 || month==11 ) {
			System.out.println("가을");
		} else if (month==12 || month==1 || month==1 ) {
			System.out.println("겨울");
		} else {
			System.out.println("1~12의 숫자를 입력해주세요.");
		}
		
	}
	
	public void method3() {
		//점수를 입력받고 학점을 출력하세요.
		// 90 이상 A,80 이상 B, 70 이상 C, 60 이상 D, 60 미만 F
		System.out.println("점수를 입력하세요 :");
		int score = sc.nextInt();
		
//		if (score>=90) {
//			System.out.println("A");
//		} 
//		if (score>=80 & score<90) {
//			System.out.println("B");
//		}
//		if (score>=70 & score<80) {
//			System.out.println("C");
//		}
//		if (score>=60 & score<70) {
//			System.out.println("D");
//		}
//		if (score<60) {
//			System.out.println("F");
//		}	
		
		if (score>=90) {
			System.out.println("A");
			} 
			else if (score>=80 & score<90) {
			System.out.println("B");
			} 
			else if (score>=70 & score<80) {
			System.out.println("C");
			} 
			else if (score>=60 & score<70) {
			System.out.println("D");
			} 
			else {
			System.out.println("F");
			}
	}

	public void method2() {
		//점수를 입력받아 60점 이상이면 합격 아니면 불합격 출력
		System.out.println("점수를 입력하세요 :");
		int score = sc.nextInt();
		
		if (score>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	public void method1() {
		if (true) {
			System.out.println("IF 실행문");
		}
	}
}
