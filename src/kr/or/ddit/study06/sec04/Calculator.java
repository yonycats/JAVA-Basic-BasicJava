package kr.or.ddit.study06.sec04;

public class Calculator {

	// a, b를 파라미터로 하는 +=/* 각각 메서드 만들기
	// 연산자 메서드
	// 계산기 만들기
	
	public double cal(String oper, int a, int b) {
		// 콜센터 연결, 번호 누름에 따라서 다른 메서드가 호출되도록 함
		if(oper.equals("+")) return add(a, b);
		if(oper.equals("-")) return sub(a, b);
		if(oper.equals("*")) return mul(a, b);
		if(oper.equals("/")) return div(a, b);
		System.out.println("지원하지 않는 연산입니다.");
		return 0;
	}

	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}

	public int mul(int a, int b) {
		return a*b;
	}

	public double div(double a, double b) {
		return a/b;
	}

}



