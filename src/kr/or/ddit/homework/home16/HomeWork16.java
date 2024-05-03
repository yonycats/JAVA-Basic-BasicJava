package kr.or.ddit.homework.home16;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}

	public void process() {
		/*
		 *   Stage class를 만들고
		 *   
		 *   game() , gameMoney();
		 *   
		 *   
		 *   StageA StageB StageC 에 상속 받으시오.
		 *   
		 *   StageA 홀짝 게임  
		 *   게임비 2000 보상 4000 
		 *   
		 *   StageB 가위바위보 
		 *   게임비 6000 보상 20000
		 *   
		 *   StageC 주사위 숫자 맞추기 게임
		 *   게임비 1만 보상 100000 
		 *   
		 *   게임비가 0원이거나 200000원이 넘으면 게임종료
		 *   
		 */
		int money = 10000;
		while(money<200000) {
			System.out.println("1. Stage A");
			System.out.println("2. Stage B");
			System.out.println("3. Stage C");
			System.out.println("현재 돈은 : "+money);
			
			int sel = sc.nextInt();
			Stage stage = null; 
			
			if(sel == 1) {
				stage = new StageA();
				money-=2000;
			}
			if(sel == 2) {
				stage = new StageB();
				money-=6000;
			}
			if(sel == 3) {
				stage = new StageC();
				money-=10000;
			}
			money+=stage.game();
			
			if (money > 200000) {
				System.out.println("현재 돈은 "+money+"원입니다. 부자다!");
			} else if (money <= 0) {
				System.out.println("현재 돈은 "+money+"원입니다. 파산이다!");
			}
			
		}
		
	}
}
