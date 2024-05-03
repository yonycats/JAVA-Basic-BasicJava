package kr.or.ddit.study06.sec04;

import java.util.Date;
import java.util.Scanner;

public class RecursionExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RecursionExample obj = new RecursionExample();
		obj.process();
	}

	public void process() {
//		method(5);
		// 재귀함수
//		int add = add(5);
//		System.out.println(add);
//		
//		long mul = mul(20);
//		System.out.println(mul);
		
		
		Date d1 = new Date();
		// 50 26819ms
		// 100
//		long fibo = fibonacci(100);
		long fibo = fibo2(100);
		
		Date d2 = new Date();
		System.out.println(d2.getTime()-d1.getTime());
		System.out.println(fibo);
		
		
	}
	
	// 디자인 패턴 중 하나임
	// 재귀함수를 사용하여 큰수가 나오는 경우, 다른 곳에 수를 저장하고 연산할 수 있음
	// 프로그래머스 2단계 수준
	long[] fiboList = new long[3000];
	
	public long fibo2(int num) {
		if (num == 2) return 2;		
		if (num == 1) return 1;		
		
		if(fiboList[num] != 0) {
			return fiboList[num];
		}
		long result = fibo2(num-1) + fibo2(num-2);
		fiboList[num] = result;
		return result;
     
	}
	
	
	
	// fibonacci7 => fibonacci6 fibonacci4
	// fibonacci6 => fibonacci5 fibonacci4
	// fibonacci5 => fibonacci4 fibonacci3
	
	
	
	// 1 2 3 5 8 13 21
	// 1+2 => 3
	// 2+3 => 5
	
	
	public long fibonacci(long num) {
		if (num == 2) return 2;		
		if (num == 1) return 1;		
            return fibonacci(num-1) + fibonacci(num-2);
	}

	
	// 5 -> 5*4*3*2*1 결과값을 리턴하세요
	// int 크기를 금방 넘기 때문에 long 타입을 넣는게 좋음
	public long mul(long num) {
		if(num==1) {
			return 1; 
		}
		return num*mul(num-1);
	}
	
	
	
	// 5 -> 5+4+3+2+1 결과값을 리턴하세요
	public int add(int num) {
		if(num==1) {
			return 1; 
		}
		return num+add(num-1);
	}
	
	
	public void method(int num) {
		System.out.println(num);
		if(num>0) {
			method(num-1);
		}
	}

}
