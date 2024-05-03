package kr.or.ddit.study06.sec02;

public class FoodExample {
	public static void main(String[] args) {
		// 객체 2개 생성 후 적절한 값을 넣어보시오.
		Food f1 = new Food();
		Food f2 = new Food();

		f1.name = "족발";
		f1.price = 16000;
		
		f2.name = "토마토 파스타";
		f2.price = 12000;
		
		System.out.println(f1);
	}


}
