package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageC extends Stage{
	
	// StageC 주사위 숫자 맞추기 게임
	// 게임비 1만 보상 100000 
	
	@Override
	public int game() {
		
		// 주사위 숫자 맞추기 게임
		System.out.println("1~6까지의 숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ran = new Random().nextInt(6)+1;
		
		System.out.println("나의 숫자 : " + num);
		System.out.println("컴퓨터의 숫자 : " + ran);
		
		if (num == 1 && ran == 1) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		} else if (num == 2 && ran == 2) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		} else if (num == 3 && ran == 3) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		} else if (num == 4 && ran == 4) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		} else if (num == 5 && ran == 5) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		} else if (num == 6 && ran == 6) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		} else if (num != ran) {
			System.out.println("졌습니다.");
			return gameMoney(0);
		}
		
		return 0;	
	}
	
	@Override
	public int gameMoney(int a) {
		if (a == 1) {
			return 100000;
		} else if (a == 0) {
			return 0;
		}
		return 0;	
	}

}
