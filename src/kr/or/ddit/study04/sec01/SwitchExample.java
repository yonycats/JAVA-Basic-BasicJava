package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}

	public void method5() {
		// 점수를 입력받고 학접을 출력하세요.
		// 90점 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 60 미만 F 
		// 끝자리가 
		// 0~2	-	,	3~6		0	,	7~9		+

		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();

		switch (score/10) {
		case 10:
			System.out.println("A-");
			break;
		case 9:
			switch (score%10) {
			case 1: case 2:
				System.out.println("A-");
				break;
			case 3: case 4: case 5: case 6:
				System.out.println("A0");
				break;
			case 7: case 8: case 9:
				System.out.println("A+");
				break;
			default:
			} break;
		case 8:
			switch (score%10) {
			case 1: case 2:
				System.out.println("B-");
				break;
			case 3: case 4: case 5: case 6:
				System.out.println("B0");
				break;
			case 7: case 8: case 9:
				System.out.println("B+");
				break;
			default:
			} break;
		case 7:
			switch (score%10) {
			case 1: case 2:
				System.out.println("C-");
				break;
			case 3: case 4: case 5: case 6:
				System.out.println("C0");
				break;
			case 7: case 8: case 9:
				System.out.println("C+");
				break;
			default:
			} break;
		case 6:
			System.out.println("F");
			break;
		default:
		}

	}

	public void method4() {
		// 100~90 	A
		// 90~80	B
		// 80~70	C
		// 70~60	D
		// 60미만	F
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
	}
	
	public void method3() {
//		 KOR, ENG, CHN => 각각 한국, 영국, 중국
		 System.out.println("약자 입력");
		 String str = sc.next();
		 switch (str) {
		case "KOR":
			System.out.println("한국");
			break;
		case "ENG":
			System.out.println("영국");
			break;
		case "CHN":
			System.out.println("중국");
			break;
		default:
			break;
		}
	}
	
	public void method2() {
		//월을 입력받고 마지막 일을 출력하시오.
		// 1,3,5,7,8,10,12 => 끝나는 날짜가 31일입니다.
		// 4,6,9,11 => 끝나는 날짜가 30일입니다.
		// 2 => 끝나는 날짜가 28, 또는 29일입니다.
		System.out.println("월을 입력하세요 :");
		int month = sc.nextInt();
		
		
//		switch (month) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			System.out.println("끝나는 날짜가 31일입니다.");
//			break;
//		case 4: case 6: case 9: case 11:
//			System.out.println("끝나는 날짜가 30일입니다.");
//			break;
//		case 2:
//			System.out.println("끝나는 날짜가 28, 또는 29일입니다.");
//			break;
//		default:
//			System.out.println("잘못된 입력입니다.");
//			break;
//		}
		
		
		if (month>=1 && month<=12) {
			if (month>=1 && month<=7 && month!=2) {
				if (month%2==1) {
					System.out.println("끝나는 날짜가 31일입니다.");
				} else if (month%2==0){
					System.out.println("끝나는 날짜가 30일입니다.");
				}
			} else if (month>=8 && month<=12) {
				if (month%2==1) {
					System.out.println("끝나는 날짜가 30일입니다.");
				} else if (month%2==0){
					System.out.println("끝나는 날짜가 31일입니다.");
				}
			} else if (month==2) {
				System.out.println("끝나는 날짜가 28, 또는 29일입니다.");
			} else {
				System.out.println("1~12 사이의 수를 입력하세요.");
			}
		}
		
	}

	public void method1() {
		int select = 1;
		switch (select) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		}
	}

}
