package kr.or.ddit.study02.sec04;

public class PrintExample {
	public static void main(String[] args) {
		 System.out.println("34061");
		 System.out.println("대전시");
		 System.out.println("중구");
		 System.out.println("계룡로");
		 
		 System.out.println("34061 ");
		 System.out.println("대전시 ");
		 System.out.println("중구 ");
		 System.out.println("계룡로\n");
		 
		 // System.out.printf("형식지정 문자열", 변수 리스트);
		 // 형식지정 문자열
		 // %[-|0]d 10진 정수
		 // - : 왼쪽 정렬
		 // 0 : 남은 왼쪽 빈공간에 0을 채움
		 
		 System.out.printf("숫자 : %d 입니다. %d \n", 1000, 1000);
		 System.out.printf("숫자 : %8d 입니다.\n", 1000);
		 System.out.printf("숫자 : %-8d 입니다.\n", 1000);
		 System.out.printf("숫자 : %08d 입니다.\n", 1000);
	}

}
