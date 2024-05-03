package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
		// 별 출력 -> 
		// 좌우 바꾸는 것은 j(컬럼)값을 반대로
		// 상하 바꾸는 것은 i(로우)값을 반대로
		
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
		method10();
//		method11();
		
	}

	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		System.out.println("숫자입력");
		int row = sc.nextInt(); 
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
System.out.println("숫자입력");
		int row = sc.nextInt();
		
		
		for(int i=0; i<row; i++) {
			for(int space=row-1-i; space>0; space--) {
				System.out.print(" ");
			}
			for(int star=0; star<i+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
//		for(int i=1; i<row+1; i++) {
//			for(int j=row; j>0; j--) {
//				if(i<j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			} System.out.println();
//		}
		
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		System.out.println("숫자입력");
		int row = sc.nextInt(); 
		
		
		
		for(int i=0; i<row; i++) {
			for(int space=0; space<i; space++) {
				System.out.print(" ");
			}
			for(int star=0; star<row-i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		for(int i=row; i>0; i--) {
//			for(int j=row; j>0; j--) {
//				if (i>=j) {
//					System.out.print("^");
//				} else {
//					System.out.print(" ");
//				}
//			} System.out.println();
//		}
		
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		System.out.println("숫자입력");
		int row = sc.nextInt(); 
		
		for(int i=row; i>0; i--) {
			for(int j=1; j<i+1; j++) {
				if (i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}
		
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		System.out.println("숫자입력");
		int row = sc.nextInt(); 
		
		
		for(int i=0; i<row; i++) {
			for(int space=0; space<row-1-i; space++) {
				System.out.print(" ");
			}
			for(int star=0; star<i*2+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
//		for(int i=0; i<=row; i++) {
//			for(int j=1; j<=row-i; j++) {
//				System.out.print(" ");
//			}
//			for(int z=1; z<=i*2-1; z++) {
//				System.out.print("*");
//			} System.out.println();
//		} 
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		System.out.println("숫자입력");
		int row = sc.nextInt(); 
		
		for(int i=row; i>0; i--) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int z=1; z<=i*2-1; z++) {
				System.out.print("*");
			} System.out.println();
		} 
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */

		System.out.println("숫자입력");
		int row = sc.nextInt(); 
		for(int i=1; i<row+1; i++) {
			if(i==1 || i==row) {
				for(int j=1; j<row+1; j++) {
					System.out.print("*");
				}
			} else {
				for(int j=1; j<row+1; j++) {
					if(j==1 || j==row) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} System.out.println();
		}


	}
	
	public void method8() {
		// 1  2  3  4  5
		// 6  7  8  9  10 
		// 11 12 13 14 15
		// 16 17 18 19 20 
		// 21 22 23 24 25 
		// 출력하기 
		
		int num = 0;
		
		for(int i=1; i<=25; i+=5) {
			for(int j=i; j<i+5; j++) {
				num = j;
				if(j>0 && j<10) {
					System.out.print(num+"  ");
				} else {
					System.out.print(num+" ");
				}
			} System.out.println();
		}
		
		
//		for(int i=1; i<=25; i+=5) {
//			for(int j=i; j<i+5; j++) {
//				num = j;
//				System.out.print(num+" ");
//			} System.out.println();
//		}
		
		
	}

	
	public void method9() {
		// 1  6  11 16 21
		// 2  7  12 17 22
		// 3  8  13 18 23 
		// 4  9  14 19 24
		// 5  10 15 20 25
		// 출력하기 
		
		int num = 0;
	
		for(int i=1; i<=5; i++) {
			for (int j=i; j<i+21; j+=5) {
				num=j;
				System.out.print(num+" ");
			} System.out.println();
		}
		
	}
	
	public void method10() {
		// 1  10 11  20 21
		// 2  9  12  19 22
		// 3  8  13  18 23
		// 4  7  14  17 24
		// 5  6  15  16 25
		// 출력하기 

		for(int h=0; h<5; h++) {
			for(int w=0; w<5; w++) {
				if(w%2==0) {
					System.out.print(1+h+w*5+"\t");
				}
				else {
					System.out.print(5+w*5-h+"\t");
				}
			}
			System.out.println();
		}

	}
	
	public void method11() {
		// 1  2  3  4  5
//         10 9  8  7  6	
		// 11 12 13 14 15  
		// 20 19 18 17 16
		// 21 22 23 24 25 
		// 출력하기 
		
		int num = 0;
		
		for(int i=1; i<=5; i++) {
			if(i%2==1) {
				for(int j=1; j<6; j++) {
					num++;
					System.out.print(num+" ");
				}
			}
			else if (i==2){
				for (int z=num+5; z>=6; z--) {
					num=z;
					System.out.print(num+" ");
				} num+=4;
			} 
			else if (i==4){
				for (int z=num+5; z>=16; z--) {
					num=z;
					System.out.print(num+" ");
				} num+=4;
			}
			System.out.println();
		} 

		
	}
}
