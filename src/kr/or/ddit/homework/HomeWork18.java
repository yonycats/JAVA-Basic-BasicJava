package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class HomeWork18 {
	
	Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}
	
	// 주사위 2개를 돌려서 나오는 합 값의 확률을 구하기
	// 배열을 쓰지 않고 만들 것
	
	public void process() {
		printHistoGram(10000);
	}

	// 주사위
	public int oneDice() {
		return new Random().nextInt(6)+1;
	}
	
	// 2개 주사위의 랜덤 합
	public int twoDice() {
		return oneDice() + oneDice();
	}
	
	// 시행 횟수
	// 여기다가 반복문 넣어서 10000번 시행 돌리기
	public void trialNtimes(int n) {

		// 2~12까지의 키를 넣어주고, 11개 행 만들기
		for (int i = 2; i <= 12; i++) {
			resultMap.put(i, 0);
		}
		
		// 내 방식 - sum과 i의 값이 같으면 해당 sum의 값에 +1 (나온 횟수 카운트)
		for (int i = 0; i < n; i++) {
			int sum = twoDice();
			resultMap.put(sum, resultMap.get(sum)+1);
		}
		
		
		
		// Map에 0~9999번 시행시의 합을 10000번 넣어주는 방식
//		Map<Integer, Integer> map = new HashMap();
//		
//		for(int i = 0; i<n; i++) {
//			map.put(i, twoDice());
//		}
//		return map;
		
		
		
//		// 선생님 방법 - void 타입 Map으로 변경해야 함
//		Map<Integer, Integer> resultMap = new HashMap();
//		for(int i=0; i<n; i++) {
//			int number = twoDice();
//			int count = 1;
//			if(resultMap.containsKey(number)) count+=resultMap.get(number);
//			resultMap.put(number, count);
//		}
//		return resultMap;
	
		
	}
	

	// HistoGram 출력하기
	public void printHistoGram(int num) {
	
		trialNtimes(num);
		
		// 각 시행 횟수의  %(100%로 환산한 값) 만큼 출력하시오.
		
		// 기본 resultMap 출력본
//		for (int i = 0; i < resultMap.size(); i++) {
//			System.out.println((i+2)+"번 : " + resultMap.get(i+2));
//		}
		
		
		// 내 방법
		for (int i=0; i<resultMap.size(); i++) {
			resultMap.put(i+2, resultMap.get(i+2)*100/10000);
			System.out.print((i+2) + "의 비율\t: ");
			for (int j = 0; j < resultMap.get(i+2); j++) {
				System.out.print("■");
			} System.out.println();
		}
		
		
		
//		// 선생님 방법, 가로 버전
//		Map<Integer, Integer> resultMap = trialNtimes(num);
//		
//		for(int i=2; i<+12; i++) {
//			int count = resultMap.get(i);
////			System.out.println(i+"\t"+count);
//			System.out.print(i+": \t ");
//			for(int j=0; j<count*100/num; j++) {
//				System.out.print("■");
//			}
//			System.out.println();
//		}
//		
//	
//		// 선생님 방법, 세로 버전 / HTML 좌표 찍는 방법 사용할 때 이런 로직을 사용함
//		int max = 0;
//		for(int i=2; i<+12; i++) {
//			int count = resultMap.get(i);
//			if(count*100/num>max)
//				max = count*100/num;
//		}
//		for(int row=0; row<max; row++) {
//			for(int i=2; i<=12; i++) {
//				int count = resultMap.get(i);
//				int per = count*100/num;
//				if(max-row-per>0) System.out.print("   ");
//				else System.out.print("■  ");
//			}
//			System.out.println();
//		}
//		System.out.println("2  3  4  5  6  7  8  9  10 11 12");
		
		
		
	}
}
