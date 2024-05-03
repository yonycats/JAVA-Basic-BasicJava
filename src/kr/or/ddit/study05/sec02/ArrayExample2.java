package kr.or.ddit.study05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample2 obj = new ArrayExample2();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
//		method6();
//		method7();
//		method8();
//		method9();
	}
	
	public void method9() {

	}
	
	public void method8() {

	}
	
	public void method7() {
		// 1. 45개짜리 temp 배열 만들기
		int[] temp = new int[45];

		
		// 2. 1~45까지 값 넣기
		for (int i=0; i<temp.length; i++) {
			temp[i]=i+1;
		}
		
		
//		//// temp[] 출력
//		for (int i=0; i<temp.length; i++) {
//			System.out.print(temp[i]+" ");
//		}
		
		
		// 3. 배열 섞기
		for (int i=0; i<100000; i++) {
			int ran = new Random().nextInt(temp.length);
			int trash = temp[0];
			temp[0] = temp[ran];
			temp[ran] = trash;
		}
		
		
		// 4. 6개짜리 lotto 배열 만들기
		int[] lotto = new int[6];
		
		// 5. lotto 배열에 temp 0~5까지 값을 복사
		System.arraycopy(temp, 0, lotto, 0, 6);
		
//		for (int i=0; i < lotto.length; i++) {
//			System.out.print(lotto[i]+" ");
//		}
		
		
		//// 내가 한거
//		for (int i=0; i<lotto.length; i++) {
//			lotto[i] = temp[i];
//		}
		
		// 6. lotto 배열 정렬하기
		for (int i=0; i<lotto.length-1; i++) {
			boolean flag = true;
			for (int j=0; j<lotto.length-1; j++) {
				if (lotto[j]>lotto[j+1]) {
					int ran = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = ran;
					flag = false;
				}
			}
			if(flag) break;
		}
		
		for (int i=0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
	}
	
	public void method6() {
		// 버블 정렬
		// 정렬 횟수가 낭비되지 않도록 코드 수정
		
		int[] num = {100,67,55,9,86,98,0,58,12,41,3,14,22,68,45,72,38};
		
		for (int i=0; i<num.length-1; i++) {
			boolean flag = true;
			for (int j=0; j<num.length-1; j++) {
				if (num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = false;
				}
			}
			if(flag) break;
		}
		for (int i=0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}
	
	public void method5() {
		// 버블 정렬
		
		int[] num = {100,67,55,9,86,98,0,58,12,41,3,14,22,68,45,72,38};
		
		for (int i=0; i<num.length-1; i++) {
			for (int j=0; j<num.length-1; j++) {
				if (num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for (int i=0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
		
		// 자체 제작 버블정렬
//		int[] num = {9, 4, -1, 0, 2};
//		int cnt = 0;
//
//		for(int i=num.length-1;i>0;i--) {
//			if(num[i]<num[i-1]) {
//				for(int j=0; j<num.length-1; j++){
//					if(num[j]>num[j+1]){
//						int temp = num[i];
//						num[j]=num[j+1];
//						num[j+1]=temp;
//						cnt++;
//					}
//				}
//			}
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.print(num[i]+" ");
//		}
		
//		System.out.println();
//		System.out.println(cnt);
		
		
	}
	
	public void method4() {
		// 3. clone

		int[] source = {1,2,3,4,5};
		int[] target = source.clone();
		
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
		
		
		target[2] = 10;
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		
	}
	
	public void method3() {
		// 2. System.arraycopy()
		
		int[] source = {1,2,3,4,5};
		int[] target = new int[source.length];
		
//		System.arraycopy(source, 0, target, 0, source.length);
		System.arraycopy(source, 1, target, 1, 3);
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];			
		}
		
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
		
		
		target[2] = 10;
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}

	}
	
	public void method2() {
		// 깊은 복사
		// 배열 공간을 별도로 확보
		// 1. 반복문 이용
		// 2. System.arraycopy()
		// 3. clone()
		
		int[] source = {1,2,3,4,5};
		int[] target = new int[source.length];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];			
		}
		
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
		
		
		target[2] = 10;
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		
		
	}
	
	public void method1() {
		// 얇은 복사 (smallow copy)
		// 복사된 배열이나 원본 배열이 변경될 때 서로간의 값이 같이 변경
		
		int[] source = {1,2,3,4,5};
		int[] target = source;
		
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
		
		
		target[2] = 10;
		System.out.println("원본 배열");
		for(int i=0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int i=0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		
		
	}

}
