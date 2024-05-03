package kr.or.ddit.study09;

// 중첩 클래스
// 실무에서 5천 줄 이상의 복잡한 프로그램을 짜는게 아니면 거의 사용하지 않음
// 내부에 중첩된 클래스를 찾을 수 없기 때문에, 쓰면 사수한테 불려갈 수 있음
public class ClassA {
	int a = 10;
	public static void main(String[] args) {
		// ClassA 에 a값 호출해보기
		ClassA A = new ClassA();
		System.out.println(A.a);
		
		// ClassB 에 b값 호출해보기
		ClassB B = A.new ClassB();
		System.out.println(B.b);
		
		// ClassC 에 c값 호출해보기
		ClassC C = new ClassA.ClassC();
		System.out.println(C.c);
		
	}

	
	class ClassB {
		int b = 11;
	}
	
	
	static class ClassC {
		int c = 12;
	}
	
	
}