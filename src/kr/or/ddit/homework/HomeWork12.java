package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork12 obj = new HomeWork12();
		obj.process();
	}

	public void process() {
		// 로또 숫자의 랜덤 범위를 1~8로 바꾸고 당첨을 확인
		int money = 100000;
		System.out.println("구매할 로또 금액 입력");

		// buy 내가 구매할 금액
		int buy = sc.nextInt();
		int[] winning = generateLotto();
		// 구매한 로또와 winning 번호를 비교 값이 같다면
		// 3만원 상금
		// money가 100만원을 넘거나 0원이 되면 종료

		int[][][] myLottoBundle = lottoBundle(buy);

		myLottoBundle = lottoBundle(money);
		

		while (true) {

			printBundle(myLottoBundle);
			int cnt = 0;
			for (int i = 0; i < myLottoBundle.length; i++) {
				for (int j = 0; j < myLottoBundle[i].length; j++) {
					for (int p = 0; p < myLottoBundle[i][j].length; p++) {
						if (myLottoBundle[i][j][p] == winning[p]) {
							cnt++;
							if (cnt == 6) {
								money += 30000;
								System.out.println("같다! 당첨금 3만원!");
							}
							
						} else {
							System.out.println("다르다! 땡땡");	
						
						}

					}
					cnt=0;
				}
			}
			money -= buy;
			if (money >= 1000000) {
				System.out.println("당첨금이 100만원이 넘었습니다.");
				break;
			} else if (money <= 0) {
				System.out.println("잔돈이 0원입니다.");
				break;
			}
			System.out.println("남은 잔돈은 : " + money);
		}

	}

	
	
	
	
	public void printBundle(int[][][] bundle) {
		for (int[][] paper : bundle) {
			System.out.println("========================");
			for (int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("========================");
		}
	}

	
	
	
	
	public int[][][] lottoBundle(int money) {

		int papers = money / 5000;
		if (money % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][6];

		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}

		if (money % 5000 != 0) {
			bundle[bundle.length - 1] = lottoPaper((money % 5000) / 1000);
		}
		return bundle;
	}

	
	
	
	
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for (int p = 0; p < paper.length; p++) {
			paper[p] = generateLotto();

		}
		return paper;
	}

	
	
	
	
	public int[][] lottoPaper() {
		return lottoPaper(5);
	}

	
	
	
	
	public int[] generateLotto() {
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			int ran = new Random().nextInt(8) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

	
	
	
	
	public String array2String(int[] arr) {
		String result = "(";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != arr.length - 1) {
				result += ", ";
			}
		}
		result += ")";
		return result;
	}

}












// 선생님 방식 풀이


//package kr.or.ddit.homework;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class HomeWork12 {
//
//   Scanner sc = new Scanner(System.in);
//
//   public static void main(String[] args) {
//      HomeWork12 obj = new HomeWork12();
//      obj.process();
//   }
//
//   public void process() {
//      // 로또 범위를 1~8로 바꾸고 당첨을 확인
//      int money = 100000;
//      while (true) {
//         System.out.println("보유금액 : " + money);
//         System.out.print("구매할 로또 금액 입력 : ");
//         int buy = sc.nextInt();
//         int[] winning = generateLotto();
//         
//         // 구매한 로또와 winning 번호를 비교 값이 같다면
//         if (buy > money) {
//            System.out.println("돈이 충분하지 않습니다");
//            continue;
//         }
//         money -= buy;
//         int[][][] bundle = lottoBundle(buy);
//         
//         // 3만원 상금
//         money += checkWinning(bundle,winning);
//
//         // money가 100만원을 넘거나 0원이 되면 종료
//         if (money >= 1000000 || money == 0) {
//            break;
//         }
//      }
//   }
//   
//   
//   public int checkWinning (int[][][] bundle, int[] winning) {
//      int win = 0;
//      for (int[][] paper : bundle) {
//         for (int[] lotto : paper) {
//            // 1. 반복문 이용해보기
////            boolean chk = true;
////            for (int i = 0; i<lotto.length; i++) {
////               if (lotto[i] != winning[i]) chk = false;
////            }
////            if (chk) win += 30000;
//            
//            // 2. Arrays.toString 이용해보기
//            // 배열 -> 문자열 / 똑같은 배열이면 상금 획득 
//            if (Arrays.toString(lotto).equals(Arrays.toString(winning))) {
//               win += 30000;
//            }
//         }
//      }
//      
//      return win;
//   }
//
//   public void printBundle(int[][][] bundle) {
//      for (int[][] paper : bundle) {
//         System.out.println("========================");
//         for (int[] lotto : paper) {
//            System.out.println(array2String(lotto));
//         }
//         System.out.println("========================");
//      }
//   }
//
//   public int[][][] lottoBundle(int money) {
//
//      int papers = money / 5000;
//      if (money % 5000 != 0)
//         papers++;
//      int[][][] bundle = new int[papers][5][6];
//      for (int i = 0; i < bundle.length; i++) {
//         bundle[i] = lottoPaper();
//      }
//      if (money % 5000 != 0) {
//         bundle[bundle.length - 1] = lottoPaper((money % 5000) / 1000);
//      }
//      return bundle;
//   }
//
//   public int[][] lottoPaper(int num) {
//      int[][] paper = new int[num][6];
//      for (int p = 0; p < paper.length; p++) {
//         paper[p] = generateLotto();
//
//      }
//      return paper;
//   }
//
//   public int[][] lottoPaper() {
//      return lottoPaper(5);
//   }
//
//   public int[] generateLotto() {
//      int[] lotto = new int[6];
//
//      for (int i = 0; i < 6; i++) {
//         int ran = new Random().nextInt(8) + 1;
//         lotto[i] = ran;
//         for (int j = 0; j < i; j++) {
//            if (lotto[j] == ran) {
//               i--;
//               break;
//            }
//         }
//      }
//      Arrays.sort(lotto);
//      return lotto;
//   }
//
//   public String array2String(int[] arr) {
//      String result = "(";
//      for (int i = 0; i < arr.length; i++) {
//         result += arr[i];
//         if (i != arr.length - 1) {
//            result += ", ";
//         }
//      }
//      result += ")";
//      return result;
//   }
//}
