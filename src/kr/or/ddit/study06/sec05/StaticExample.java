package kr.or.ddit.study06.sec05;

public class StaticExample {
	int a = 10;
	// static 영역은 어디서든 볼 수 있고, 호출할 수 있다.
	// static b는 어디서든 볼 수 있고, 호출할 수 있다.
	static int b = 10;
	
	
	// static이 아닌 method 또는 변수를 부르려면 new class를 해서 새로 생성을 해야 부를 수 있다.
	
	// static 영역이 아닌 곳에서는  a를 부를 수 없다 
	public void method1() {
		
	}
	
	public void method2() {
		
	}
	
	
	// static 영역에서는 a는 부를 수 없고, static인 b는 부를 수 있다 
	// static 영역은 어디서든 볼 수 있고, 호출할 수 있다.
	public static void method3() {
		
	}
	
	public static void method4() {
		
	}
	
	
	
}
