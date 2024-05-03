package kr.or.ddit.study06.sec03;

import java.util.Random;

public class TriangleExample {
	public static void main(String[] args) {
		
//		new Point(10, 0);
		
		// 주소값을 저장하지 않고 이렇게 사용할 수도 있음
//		int ran = new Random().nextInt(10);
		
		
		Point p1 = new Point(0, 0);
		Triangle t1 = new Triangle(p1, new Point(10, 0), new Point(0, 10));
		System.out.println(t1);
		System.out.println("넓이는 : " + t1.area);
		
		
		Triangle t2 = new Triangle(0, 0, 10, 0, 0, 10);
		System.out.println(t2);
		System.out.println("넓이는 : " + t2.area);
		
	}

}
