package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork13 {
	
	public static void main(String[] args) {
		/*
		 *  예약 시스템.
		 */
		Scanner sc = new Scanner(System.in);
		Reserve res = Reserve.getInstance();
		while(true) {
			System.out.println("1. 예약");
			System.out.println("2. 예약 처리");
			System.out.println("3. 종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("예약자 이름을 입력해주세요.");
				String name = sc.next();
				res.reservation(name);
			}
			if(sel == 2) {
				res.complete();
			}
			if(sel == 3) {
				break;
			}
		}
		
		
	}
}







class Reserve{
	private String  name;
	private boolean reserve;
	
	
	// 1번
	// 싱글톤 적용하기
	private static Reserve instance;
	
	private Reserve() {

	}

	public static Reserve getInstance() {
		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
	
	
	
	
	
	// 2번
	/*
	 *  예약하는 메소드 만들기 
	 *  이미 예약되어있다면 "예약이 되어있습니다." 출력 
	 *            reserve = true;
	 */
	public void reservation(String name) {
		if(this.name != null && this.name.equals(name)) {
			System.out.println("이미 예약이 되어있습니다.");
			System.out.println("2번을 눌러 예약 처리를 완료한 후, 다시 예약을 해주세요.");
		} else if (this.name == null) {
			this.name = name;
			System.out.println("예약이 완료되었습니다.");
			reserve = true;
		} else if (!this.name.equals(name)) {
			System.out.println("이미 예약 중인 사람이 있습니다.");
		} 
		
	}
	
	
	
	
	
	
	/*
	 * 예약 처리 하는 메소드 만들기.
	 * name = null; 
	 * 이름 변수를 비우는 것, 예약은 완료했고 다음 예약을 위해 변수를 비움
	 * resever = false; 
	 * false를 만드는 이유 : 처리가 완료되어 모든 변수가 null이 되기 전까지는 다른 사람이 예약하지 못하도록 하는 것
	 * 
	 * "예약된 사람 이름" 님 처리 완료되었습니다.
	 */
	public void complete() {
		if(reserve == true) {
			System.out.println(this.name+" 님 처리 완료되었습니다.");
			this.name = null;
			reserve = false;
		}
		
	}
	
	
	
	
	
}
