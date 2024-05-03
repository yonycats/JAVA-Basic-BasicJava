package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	static Scanner sc = new Scanner(System.in);
	Mem[] memList = new Mem[100];
	int cur = 0;

	public static void main(String[] args) {
		HomeWork14 h14 = new HomeWork14();

		while (true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			System.out.println("5. 종료.");
			int sel = sc.nextInt();
			if (sel == 1) {
				h14.addMember();
			}
			if (sel == 2) {
				h14.deleteMember();
			}
			if (sel == 3) {
				h14.updateMember();
			}
			if (sel == 4) {
				h14.printMemberList();
			}
			if (sel == 5) {
				break;
			}
		}
	}

	
	
	// 2번. 회원 정보 입력하기
	public void addMember() {
		Mem memAdd = new Mem();

		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		memAdd.setId(id);

		for (int i=0; i<memList.length; i++) {
			while (memList[i]!=null && memList[i].getId().equals(id)) {
				System.out.println("중복된 아이디입니다.");
				id = sc.next();
			}
		}

		System.out.println("패스워드를 입력하세요.");
		String pass = sc.next();
		memAdd.setPass(pass);

		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		memAdd.setName(name);

		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		while (age < 0 || age > 150) {
			System.out.println("유효한 나이를 입력하세요. (0~150)");
			age = sc.nextInt();
		}
		memAdd.setAge(age);

		memList[cur++] = memAdd;

		System.out.println();

	}
	


	/*
	 * 회원 전체 정보 출력하기.
	 */
	
	// 3번. 회원 전체 정보 출력하기
	public void printMemberList() {
		int num = 0;
		
		for (int i = 0; i < cur; i++) {
			Mem memPrint = memList[i];
			// get 메소드를 이용해서 출력하기 (toString 사용 X)
			
			memPrint.getId();
			memPrint.getPass();
			memPrint.getName();
			memPrint.getAge();
			System.out.println((++num) + "번\t" + "ID : " + memPrint.getId() + "\tPW : " + memPrint.getPass() + 
								"\t이름 : " + memPrint.getName() + "\t나이 : " + memPrint.getAge());
		} num = 0;
		System.out.println();
	} 

	
	
	/*
	 * 회원 정보 수정하기.
	 */

	// 4번. 회원 정보 수정하기
	public void updateMember() {
		/*
		 * 회원 전체 정보 출력하기.
		 */
		printMemberList();

		System.out.print("수정할 회원 번호 입력.");
		int numUp = sc.nextInt();
		Mem memUpdate = memList[numUp-1];
		/*
		 * 정보 수정.
		 */
		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		memUpdate.setId(id);
		
		boolean idCheck = false;

		while(idCheck == false) {
			for (int i=0; i<cur; i++) {
				if (memList[i] != null && i!=numUp-1 && memList[i].getId().equals(id)) {
					idCheck = false;
					break;
				}
				if(!memList[i].getId().equals(id) && i!=numUp-1) {
					idCheck = true;
				}
			}
			if (idCheck == false) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				id = sc.next();
			}
		}

		System.out.println("패스워드를 입력하세요.");
		String pass = sc.next();
		memUpdate.setPass(pass);

		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		memUpdate.setName(name);

		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		memUpdate.setAge(age);

		System.out.println();
		
	}

	
	// 5번. 회원 정보 삭제하기
	public void deleteMember() {
		printMemberList();
		System.out.print("삭제할 회원 번호 입력.");
		int numDel = sc.nextInt();
		
		for (int i=numDel-1; i<cur-1; i++) {
			memList[i] = memList[i+1];
		} 
		memList[cur-1] = null;
		cur--;
		
		System.out.println("삭제가 완료되었습니다.");
		System.out.println();
		
		
		
//		// 선생님 답
//		Mem[] temp = new Mem[100];
//		printMemberList();
//		System.out.println("삭제할 회원 번호를 입력하세요.");
//		int num = sc.nextInt();
//		int add = 0;
//		for (int i=0; i<cur; i++) {
//			if(i==num) add++;
//			temp[i] = memList[i+add];
//		}
//		memList = temp;
//		cur--;
//		printMemberList();
		
		

	}
	
	
	
}



 



class Mem {
	private String id;
	private String pass;
	private String name;
	private int age;

	/*
	 * 생성자 사용x getter setter 이용할것.
	 */

	
	// 1번. getter setter 만들기
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}