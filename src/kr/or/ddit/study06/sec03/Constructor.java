package kr.or.ddit.study06.sec03;

public class Constructor {
	int a;
	int b;
	
	
	// 값을 넣는 방식을 2가지 모두 하고 싶은 경우,
	// 생성자를 기본생성자, 매개변수가 있는 생성자 
	// 2가지 모두 만들어줘야 함.

	
	// 기본 생성자
	// 기본 생성자가 없어도 자동으로 만들어짐
	public Constructor() {
		
	}
	
	// 하지만 기본 생성자가 아닌 인자가 있는 생성자만 있을 경우,
	// 기본 생성자가 자동으로 만들어지지 않음
	public Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}

}
