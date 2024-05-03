package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageA extends Stage{
			
	// StageA 홀짝 게임  
	// 게임비 2000 보상 4000 
	
	
	@Override
	public int game() {
		
		// 홀짝게임
		System.out.println("1. 홀");
		System.out.println("2. 짝");
		System.out.println("숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ran = new Random().nextInt(2)+1;
		
		
		System.out.println("나의 숫자 : " + num);
		System.out.println("컴퓨터의 숫자 : " + ran);
		
		if (num == ran) {
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
			return 4000;
		} else if (a == 0) {
			return 0;
		}
		return 0;	
	}
	
	
}
