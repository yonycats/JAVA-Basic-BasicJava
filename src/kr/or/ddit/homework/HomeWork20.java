package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class HomeWork20 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork20 obj = new HomeWork20();
		obj.process();
	}

	
	Map<String, Student2> data = new HashMap();
	
	// 로그인 아이디 체크
	String loginId = null;
	
	public void process() {
		while (true) {
			try {
				System.out.println("1. 회원 가입");
				System.out.println("2. 회원 탈퇴");
				System.out.println("3. 정보 수정 ");
				System.out.println("4. 내정보 출력");
				System.out.println("5. 로그인 ");
				System.out.println("6. 로그아웃 ");
				System.out.println("7. 종료 ");
				int sel = sc.nextInt();
				if (sel == 1) {
					insert();
				}
				if (sel == 2) {
					delete();
				}
				if (sel == 3) {
					update();
				}
				if (sel == 4) {
					print();
				}
				if (sel == 5) {
					login();
				}
				if (sel == 6) {
					logout();
				}
				if (sel == 7) {
					break;
				}
			} catch (Exception e) {
				System.out.println("1~7 사이의 숫자만 입력 가능합니다.");
				break;
			}
		}
	}
	
	
	
	// 0. 본인확인
	public boolean selfCheck() {
		Student2 std = new Student2();
		std = data.get(loginId);
		
		System.out.println("계정 정보를 확인합니다.");
		System.out.println("아이디를 입력하세요.");
		String id = sc.next();
		
		if (id.equals(std.id)) {
			System.out.println("비밀번호를 입력하세요.");
			String pW = sc.next();
			
			if (pW.equals(std.pass)) {
				return true;
			}
		} 
		System.out.println("현재 로그인 중인 계정 정보와 다릅니다.");
		return false;
	}
	
	
	
	// 1. 회원 가입
	public void insert() {
		// id 중복 체크 
		
		if(loginId != null) {
			System.out.println("로그아웃한 상태에서만 사용할 수 있는 메뉴입니다.");
			return;
		}
		
		while (true) {
			System.out.println("아이디를 입력해주세요.");
			String id = sc.next();
			
			while (true) {
				
				if (data.containsKey(id)) {
					System.out.println("중복된 아이디입니다. 다시 입력하세요.");
					id = sc.next();
				} else {
					break;
				}
			}
			
			System.out.println("비밀번호를 입력해주세요.");
			String pass = sc.next();

			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			
			Student2 std = new Student2();
			std.id = id;
			std.name = name;
			std.pass = pass;
			
			data.put(id, std);
			System.out.println("회원가입에 성공했습니다.");
			break;
		}
		
	}
	

	// 2. 회원 탈퇴
	public void delete() {
		// 로그인 후 id pass 같을 경우 회원 탈퇴 
			if (loginId == null) {
				System.out.println("로그인 상태에서만 사용할 수 있는 메뉴입니다.");
				return;
			}
			
			if (selfCheck()==true) {
				data.remove(loginId);
				System.out.println("계정 삭제가 완료되었습니다.");
				loginId = null;
			}
		
	}
	
	
	
	// 3. 정보 수정
	public void update() {
		// 로그인 후 id pass 같을 경우 수정 
		if (loginId == null) {
			System.out.println("로그인 상태에서만 사용할 수 있는 메뉴입니다.");
			return;
		}
		
		if (selfCheck() == true) {
			while (true) {
				System.out.println("변경할 아이디를 입력해주세요.");
				String id = sc.next();

				System.out.println("변경할 비밀번호를 입력해주세요.");
				String pass = sc.next();

				System.out.println("변경할 이름을 입력해주세요.");
				String name = sc.next();

				Student2 std = new Student2();
				std = data.get(loginId);
				std.id = id;
				std.name = name;
				std.pass = pass;
				
				data.put(id, std);
				data.remove(loginId);
				loginId = id;

				System.out.println("회원 정보 변경에 성공했습니다.");
				break;
			}
		}
		
	}
	
	
	
	// 4. 내 정보 출력
	public void print() {
		// 로그인 후 id pass 같을 경우, 본인 정보 출력
		// 이미 로그인이 되어 있을 경우, 바로 출력
		if (loginId == null) {
			System.out.println("로그인 상태에서만 사용할 수 있는 메뉴입니다.");
			return;
		}
		
		if (selfCheck()==true) {
			Student2 std = new Student2();
			std = data.get(loginId);
			System.out.println("ID : "+std.id+", PW : "+std.pass+", Name : "+std.name);
		}
		
	}
	
	
	
	
	// 5. 로그인
	public void login() {
		// 로그인 
		int cnt = 0;
		
		if (loginId != null) {
			System.out.println("로그아웃 상태에서만 사용할 수 있는 메뉴입니다.");
			return;
		}
		
		while (true) {
			
			System.out.println("아이디를 입력해주세요.");
			String id = sc.next();
			
			Student2 std = data.get(id);
			
			if (data.containsKey(id)) {
				System.out.println("비밀번호를 입력해주세요.");
				String pW = sc.next();
				if (std.pass.equals(pW)) {
					System.out.println("로그인이 완료되었습니다.");
					loginId = std.id;
					break;
				}
			} System.out.println("계정 정보가 틀렸습니다.");
			cnt++;
			
			if (cnt == 3) {
				System.out.println("3회 입력 제한을 초과했습니다.");
				break;
			}
		}
		
	}
	
	
	
	// 6. 로그아웃
	public void logout() {
		// 로그 아웃 
		System.out.println("로그아웃이 완료되었습니다.");
		loginId = null;
	}
	
	
	
}

class Student2{
	String id;
	String pass;
	String name;
}
