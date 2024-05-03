package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample3 obj = new ArrayExample3();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		int[] arr = {1,4,2,3,5};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void method4() {
		String[] strList = {"a", "b", "c"};
		
		for (int i=0; i<strList.length; i++) {
			String str = strList[i];
			System.out.println(str);
		}
		
	}
	
	public void method3() {
		// 2차원 배열 내에서, 1차원 배열의 크기를 가변적으로 활용
		int [][] arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[5];

	}
	
	public void method2() {
		
		// 1차원 배열 숫자 순서대로 국영수
		// score[0]=홍길동, score[1]=강감찬, score[2]=이순신
		int[][] score = {{80,75,87},
						{88,90,91},
						{77,73,65}};
		
		// 홍길동의 국어 점수
		// int hong_kor;
		int[] hong = score[0];
		int hong_kor = hong[0];
		
		hong_kor = score[0][0];
		System.out.println("홍길동의 국어 점수는 : "+score[0][0]);
		
		
		// 강감찬의 수학 점수
		// int kang_math;
		int kang_math = score[1][2];
		System.out.println("강감찬의 수학 점수는 : "+score[1][2]);
		
		
		// 이순신의 영어 점수
		// int lee_eng;
		int lee_eng = score[2][1];
		System.out.println("이순신의 영어 점수는 : "+score[2][1]);
		
		
		// 홍길동의 총점
		int hong_sum=0;
		for (int i=0; i<score[0].length; i++) {
			hong_sum+=score[0][i];
		}
		System.out.println("홍길동의 총점은 : "+hong_sum);
		
		
		// 국어 점수의 총합
		int kor_sum=0;
		for (int i=0; i<score.length; i++) {
			kor_sum+=score[i][0];
		}
		System.out.println("국어 점수의 총합은 : "+kor_sum);
		
		kor_sum = score[0][0] + score[1][0] + score[2][0];
		System.out.println("국어 점수의 총합은 : "+kor_sum);
		
	}

	public void method1() {
		int[][] arr = new int[3][5];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
