package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample1 obj = new ArrayExample1();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		// 거스름돈을 입력받아 화폐 단위별로 갯수를 구하시오
		// ex) 77650 => 10000 7개, 5000 1개, 1000 2개, 500 1개, 100 1개, 50 1개, 10원 0개
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10};
		// 50000원을 추가하려면 배열 앞에 50000원만 추가하면 됨 -> 배열의 효용성 
		
		System.out.println("금액을 입력하세요 : ");
		int money = sc.nextInt();
//		
//		// 선생님 풀이
//		for(int i=0; i<coin.length; i++) {
//			int result = money/coin[i];
//			money%=coin[i];
//			if(result==0) continue;
//			System.out.println(coin[i]+" "+result+"개 ");
//		}
		
		
		// 내 풀이
		int[] money00 = new int[7];
		
		for(int i=0; i<coin.length; i++) {
			money00[i] = money/coin[i];
			money -= money00[i]*coin[i];
		}
		
		for(int i=0; i<coin.length; i++) {
			if(money00[i]==0) continue; {
				System.out.println(coin[i]+"원 "+money00[i]+"개, ");
			}
		}
		
	}
	
	public void method6() {
		int[] score = {80,90,87,60,94};
		
		int max = 0;
		
		// 정수 중에 가장 작은/큰 값
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MAX_VALUE;
		System.out.println("max1 : "+max1);
		System.out.println("max2 : "+max2);
		
		// 최댓값 구하기
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}System.out.println("최댓값은 : "+max);
		
		
		// 최솟값 구하기
		for(int i=0; i<score.length; i++) {
			if(max > score[i]) {
				max = score[i];
			}
		}System.out.println("최솟값은 : "+max);
		
		
		
	}
	
	public void method5() {
		int a = 10;
		int b = 7;
		
		// a값과 b값을 바꿔보기
		int temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("a : "+a+", b : "+b);
		
		
	}
	
	public void method4() {
		int[] array = {1,2,3,4,5};
		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		// 역순으로 출력
		
		// 1번
//		for(int i=array.length-1; i>=0; i--) {
//			System.out.print(array[i]+"\t");
//		}
		
		// 2번
		for(int i=0; i<array.length; i++) {
			System.out.print(array.length-i+"\t");
		}
		
	}
	
	public void method3() {
		// 크기 3짜리 배열을 만들고
		// 각각 값을 입력 해보시오
		// array
		
		int[] array = new int[3];
		array[0] = 20;
		array[1] = 35;
		array[2] = 45;
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void method2() {
		// int[] students = new int[5];
		// int[]				<- 1차원 배열
		// students				<- 배열 이름(변수)
		// new int[배열 크기]		<- 배열 생성
		
		int[] students = new int[5];
		students[0] = 100;
		students[1] = 89;
		students[2] = 77;
		students[3] = 94;
		students[4] = 62;
		
		int sum = 0;
		for(int i=0; i<students.length; i++) {
			sum+=students[i];
		} System.out.println(sum);
		
		
	}
	
	public void method1() {
		// 변수를 5개 만들고 각각에 0~100 사이 값을 넣을 것
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 15;
		int e = 25;
		
		// 총합 구하기
		int sum = a+b+c+d+e;
		System.out.println(sum);
	}

}
