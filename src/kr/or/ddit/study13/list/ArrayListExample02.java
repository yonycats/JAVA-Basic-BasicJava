package kr.or.ddit.study13.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample02 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayListExample02 obj = new ArrayListExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	
	
	public void method3() {
		// 새로운 클래스(오브젝트) Member을 만들고
		// 리스트의 제네릭 타입으로 Member를 정의
		List<Member> memberList = new ArrayList();
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원삭제");
			System.out.println("3. 회원 정보수정");
			System.out.println("4. 전체 출력");
			
			int sel = sc.nextInt();
			
			if(sel==1) {
				Member member = new Member();
				
				System.out.println("ID : ");
				String id = sc.next();
				
				System.out.println("Name : ");
				String name = sc.next();
				
				// List와 같은 타입 Member member로 만든 변수 묶음을
				// memberList의 인덱스에 변수를 한꺼번에 통째로 넣음
				member.setId(id);
				member.setName(name);
				memberList.add(member);
			}
			
			if(sel==2) {
				// 1번 출력
//				for (int i=0; i<memberList.size(); i++) {
//					System.out.println(i+". "+memberList.get(i).getId()+", "+memberList.get(i).getName());
//				}
				
				// 2번 출력
				for (int i=0; i<memberList.size(); i++) {
					Member member = memberList.get(i);
					System.out.println(i+". "+member.getId()+", "+member.getName());
				}
				
				System.out.println("삭제할 회원 번호 입력");
				int index = sc.nextInt();
				// remove 메서드 실행 시, 리턴 값이 있기 때문에 출력이 가능함
				Member member = memberList.remove(index);
				System.out.println(member.getName()+"님이 탈퇴하셨습니다.");
				
			}
			
		}
	}
	
	
	
	public void method2() {
		// 입력하는 문자를 list에 저장하시오
		List<String> list = new ArrayList();
		while(true) {
			String word = sc.next();
			// end를 입력한다면 종료
			if(word.equals("end")) break;
			list.add(word);
		}
		
		// list 출력 해보기
		// 1. 일반 for문
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		// 2. 향상된 for문
		for (String str : list) {
			System.out.print(str+" ");
		}
		
		
	}

	
	
	public void method1() {
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		// num 의 약수 값을 ArrayList에 담으시오.
		
		
//		// 1. 배열이었을 경우 방법
//		int cur = 0;
//		for (int i=0; i<=num; i++) {
//			if(num%i==0) cur++;
//		}
//		int[] array = new int[cur];
//		cur = 0;
//		for (int i=1; i<=num; i++) {
//			if(num%i==0) array[cur++] = i;
//		}
		
		
		// 2. 리스트를 사용할 경우 방법
		// List list = new ArrayList(); 리스트의 타입을 정하지 않으면 기본적으로 오브젝트 타입으로 만들어짐
		// 오브젝트 : 자바의 최상위 타입 => 자바의 모든 타입을 받을 수 있음
		//			하지만 다시 꺼낼 때에는 변환을 해줘야 함
		// List<Integer> list  =>  <> 꺽쇠로 타입을 정의, 제네릭이라고 함
		// 타입을 1가지로만 사용할 거라면 타입을 지정해줌. => 리스트의 값을 오브젝트가 아닌 특정 타입에 넣으려고 할 경우
		List<Integer> list = new ArrayList();
//		System.out.println(list);
		
		for (int i=1; i<=num; i++) {
			if(num%i==0) list.add(i);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i=0; i<list.size(); i++) {
//			int n = ()list.get(i);
			int n = list.get(i);
		}
		
		
	}

	
}




