package kr.or.ddit.study07.sec02;

import java.util.Scanner;

public class AnimalMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalMain obj = new AnimalMain();
		obj.process();
	}

	public void process() {
		
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		System.out.println("3. 호랑이");
		int sel = sc.nextInt();
		
		// 오버라이딩 불러오기 1번
		// 1번으로 생성하면 저장공간을 객체 2개만큼 차지하게 됨,
		// 객체를 추가할 수록 힙 공간 차지 ++하게 됨
//		Animal cat = new Cat();
//		Animal dog = new Dog();
//
//		if (sel == 1) cat.cry();
//		if (sel == 2) dog.cry();
		
		// 오버라이딩 불러오기 2번
		// 2번으로 생성하면 ani의 객체는 생성되고 덮어씌워지고를 반복하지만
		// 힙 공간(저장공간)을 객체 1개만큼만 사용해서 효율적으로 사용할 수 있게 됨
		Animal ani = null;
		if (sel == 1) ani = new Cat();
		if (sel == 2) ani = new Dog();
		if (sel == 3) ani = new Tiger();
		
		ani.cry();
		
	}

	
}
