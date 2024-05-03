package kr.or.ddit.study02.sec03;

public class TypeChange4 {
	public static void main(String[] args) {
		// Math.random()
		// 0.0 ~ 0.9xxx 난수 반환
		
		double ran = Math.random()*10;
		System.out.println(ran);
		
		// 0~9 +1 => 1~10
		int ran2 = (int)ran+1;
		System.out.println(ran2);
		
		// 21~30 숫자를 랜덤으로 출력하시오.
		// 0.000 ~ 0.9xxx 값이 기본인 Math.random()에 *10 -> 0~9
		// 0~9에 21을 더하면 -> 21~30의 범위값으로 변함
		int ran3 = (int)(Math.random()*10)+21;
		System.out.println(ran3);
		
		// 31~45 숫자를 랜덤으로 출력하시오.
		// 0.000 ~ 0.9xxx 값이 기본인 Math.random()에 *15+31을 하면 > 31~45
		int ran4 = (int)(Math.random()*15);
		System.out.println(ran4);
	}
}
