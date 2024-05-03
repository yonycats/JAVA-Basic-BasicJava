package kr.or.ddit.study02.sec01;

public class ExampleVar03 {
	int c=50;
	public static void main(String[] args) {
		// int 타입 변수 x, y 를 선언하시오
		int x;
		int y;
		
		// x = 2, y = 3 값을 넣으시오
		x=2;
		y=8;
		
		{
			{
				int c=55;
				System.out.println(c);
			}
		}
		
		// x+y 값을 출력하시오
		System.out.println(x+y);
		System.out.println(test());
		test1();
	}
	public static int test() {
		int c=100;
		return c;
	}
	
	public static void test1() {
		System.out.println("자바 메서드 호출");
	}
}
