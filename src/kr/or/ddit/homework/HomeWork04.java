package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}

	public void process() {
		
		/*
		 * 0 -> 가위 
		 * 1 -> 바위 
		 * 2 -> 보
		 * 
		 * 컴퓨터가 랜덤으로 내는 바위 바위 보랑, 
		 * 내가 입력한 가위 바위 보를 비교해서 승패를 출력하시오. 
		 * if문 사용 
		 * ex) 컴퓨터 : 가위, 사람 : 보, 결과 : 졌다/이겼다/비겼다.
		 */
		
		System.out.println("\"가위 = 0, 바위 = 1, 보 = 2\" 중 숫자 한가지를 입력하세요.");
		int num = sc.nextInt();
		int ran = new Random().nextInt(3);
		
		String com = "";
		if (ran==0) {
			com="가위";
		} else if (ran==1) {
			com="바위";
		} else if (ran==2) {
			com="보";
		}
		
		String numInput = "";
		if (num==0) {
			numInput="가위";
		} else if (num==1) {
			numInput="바위";
		} else if (num==2) {
			numInput="보";
		}
		
		
		if (num>=0 && num<=2) {
			if (num==0 && ran==0 || num==1 && ran==1 || num==2 && ran==2) {
				System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 비겼습니다.");
			}
			else if (num==0 && ran==1 || num==1 && ran==2 || num==2 && ran==0) {
				System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 졌습니다.");
			}
			else if (num==0 && ran==2 || num==1 && ran==0 || num==2 && ran==1) {
				System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 이겼습니다.");
			}
		} else {
			System.out.println("0, 1, 2 중에 한가지를 입력하세요.");
		}
		
		
		
//		if (num>=0 && num<=2) {
//			if (num==0) {
//				if (ran==0) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 비겼습니다.");
//				}
//				else if (ran==1) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 졌습니다.");
//				}
//				else if (ran==2) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 이겼습니다.");
//				}
//			}
//			else if (num==1) {
//				if (ran==0) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 이겼습니다.");
//				}
//				else if (ran==1) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 비겼습니다.");
//				}
//				else if (ran==2) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 졌습니다.");
//				}
//			}
//			else if (num==2) {
//				if (ran==0) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 졌습니다.");
//				}
//				else if (ran==1) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 이겼습니다.");
//				}
//				else if (ran==2) {
//					System.out.println("\"컴퓨터 : "+com+"\","+" 사람 : "+numInput+"\""+" 결과 : 비겼습니다.");
//				}
//			}
//		} else {
//			System.out.println("0, 1, 2 중에 한가지를 입력하세요.");
//		}
		
		
	}
}
