package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageB extends Stage{
	
	// StageB 가위바위보 
	// 게임비 6000 보상 20000
	
	@Override
	public int game() {
		
		// 가위바위보 게임
		System.out.println("\"가위 = 0, 바위 = 1, 보 = 2\" 중 숫자 한가지를 입력하세요.");
		Scanner sc = new Scanner(System.in);
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
				System.out.println("\"사람 : "+numInput+"\","+" 컴퓨터 : "+com+"\""+" 결과 : 비겼습니다.");
				return gameMoney(0);
			}
			else if (num==0 && ran==1 || num==1 && ran==2 || num==2 && ran==0) {
				System.out.println("\"사람 : "+numInput+"\","+" 컴퓨터 : "+com+"\""+" 결과 : 졌습니다.");
				return gameMoney(0);
			}
			else if (num==0 && ran==2 || num==1 && ran==0 || num==2 && ran==1) {
				System.out.println("\"사람 : "+numInput+"\","+" 컴퓨터 : "+numInput+"\""+" 결과 : 이겼습니다.");
				return gameMoney(1);
			}
		} else {
			System.out.println("0, 1, 2 중에 한가지를 입력하세요.");
		}
		
		return 0;	
	}
	
	@Override
	public int gameMoney(int a) {
		if (a == 1) {
			return 20000;
		} else if (a == 0) {
			return 0;
		}
		return 0;	
	}

}
