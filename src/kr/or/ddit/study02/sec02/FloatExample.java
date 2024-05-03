package kr.or.ddit.study02.sec02;

public class FloatExample {
	public static void main(String[] args) {
	// 정수형
	// 1. bite  : 1bite (-128~127)
	// 2. short : 2bite (-32768~32767)
	// 3. int   : 4bite (-2^31~2^31)	정수형의 기본 타입
	// 4. long  : 8bite (-2^63~2^63)	뒤에 L(1)을 붙임
	
	byte b1 = 127;
	System.out.println("b1= "+b1);
	
	// 컴파일 에러
	// byte b2 = 128;
	
	short s1 = 128;
	System.out.println("s1= "+s1);
	
	// 정수형의 기본 타입은 int
	// int보다 작은 타입인 short를 정수와 연산하려고 해서 오류발생
	// short s2 = s1+10; 을 short형으로 강제변환
	short s2 = (short)(s1+10);
	System.out.println("s2= "+s2);
	
	int i1 =1000;
	System.out.println("i1= "+i1);
	int i2 = i1+10;
	System.out.println("i1= "+i2);
	
	long l1 = 1000;
	System.out.println("l1= "+l1);
	long l2 = l1+10;
	System.out.println("l2= "+l2);
	
	// int보다 큰 숫자를 long 타입으로 표현하려면, L을 뒤에 붙여줘야 함
	long l3 = 10000000000l;
	System.out.println(l3);
	}
}
