package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();
	}
	
	public void process() {
//		generateLotto();
		
//		int[][] paper= lottoPaper();
//		for (int i=0; i<paper.length; i++) {
//			System.out.println(array2String(paper[i]));
//		}
		
		int [][][] bundle = lottoBundle(12000);
		printBundle(bundle);
	}
	
	
	
	// 4번 메서드
	// 로또 용지 1장=5줄 당 ===== 넣기
	public void printBundle(int[][][] bundle) {
		for (int[][] paper : bundle) {
			System.out.println("========================");
			for (int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("========================");
		}
	}
	
	
	
	
	
	// 3번 메서드
	// 로또 용지를 3차원 배열에 여러장 넣은 것
	public int[][][] lottoBundle (int money) {
		
		// money에 12000을 넣으면 papers = 2
		int papers = money/5000;
		
		// 로또 1장에 5000원
		// 잔돈이 남으면 (money%5000 != 0) 
		// 로또를 추가로 삼 = (papers++)
		// papers는 6개짜리 숫자 배열을 5줄이 1장
		if(money%5000 != 0) papers++;
		
		// bundle = 내가 산 로또뭉치(로또 여러장)
		int[][][] bundle = new int[papers][5][6];
		
		// bundle에다가 lottoPaper (로또 1장씩) 을 넣음
		// 12000일 경우, bundle에 로또종이 3장이 들어감 
		for (int i=0; i<bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		
		// 잔돈이 남을 경우 = money%5000 != 0
		// bundle의 인덱스에서, lottoPaper((money%5000)/1000)만큼의 인덱스 길이가 됨
		// 잔돈 = lottoPaper((money%5000)/1000) 
		// => 12000일 경우 bundle의 마지막, 인덱스 [2]의 배열의 길이는 5에서 2가 됨
		if(money%5000 != 0) {
			bundle[bundle.length-1] = lottoPaper((money%5000)/1000);
		}
		return bundle;
	}
	
	
	// 2번 메소드
	// 1장(paper)에 6개짜리 숫자 배열을 5줄씩 넣음
	// paper = 로또 1장 완성
	public int[][] lottoPaper(int num) {
		int[][] paper= new int[num][6];
		
		for (int p=0; p<paper.length; p++) {
			paper[p] = generateLotto();
		}
		return paper;
	}
	
	
	public int[][] lottoPaper() {
		return lottoPaper(5);
		
	}
	
	
	
	
	
//	public int[][] lottoPaper() {
//		int[][] paper= new int[5][6];
////		
//		for (int p = 0; p < paper.length; p++) {
////			int[] lotto = new int[6];
////			
////			for (int i=0; i<6; i++) {
////				int ran = new Random().nextInt(45)+1;
////				lotto[i] = ran;
////				for (int j=0; j<i; j++) {
////					if(lotto[j] == ran) {
////						i--;
////						break;
////					}
////				}
////			}
////			Arrays.sort(lotto);
////			paper[p] = lotto;
//			
//			
//			paper[p] = generateLotto();
//		}
//		
//		return paper;
//	}


	
	
	
	// 1번 메서드
	public int[] generateLotto() {
		int[] lotto = new int[6];
		
		// 랜덤한 값 6개 뽑기
		for (int i=0; i<6; i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			for (int j=0; j<i; j++) {
				if(lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
		// 배열 정렬 단축어, 단축키
		Arrays.sort(lotto);
		return lotto;
		
		
//		// 1. Arrays.toString 사용해서 배열 출력해보기
//		System.out.println(Arrays.toString(lotto));
//		
//		// 2. array2String로  Arrays.toString과 똑같은 메서드 만들어보기
//		System.out.println(array2String(lotto));
	}
	
	

	// array2String로  Arrays.toString과 똑같은 메서드 만들어보기
	// array2String == Arrays.toString
	// 일반적으로 많이 사용하는 방법임
	// int[] arr == lotto
	public String array2String(int[] arr) {
		String result = "(";
		
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
			
			if (i != arr.length-1) {
				// 마지막 값이 아니면 , 찍기
				result += ", ";
			}
			
		}
		result += ")";
		return result;
	}
	
}
