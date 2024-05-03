package kr.or.ddit.KwonWork;

import java.util.Scanner;

import kr.or.ddit.homework.HomeWork10.Student;

public class KwonWork01 {
	//1. 회원가입
	//  -> 아이디, 비번, 전화번호 입력
	//  -> 아이디 중복되면 생성 X
	//	-> 비밀번호 => 대문자, 특수문자 포함(ASCII 코드)
	//  -> 전화번호 중복되면 생성 X (전화번호에 - 입력 X)
	//2. 로그인
	//  -> 아이디 비번 확인 후 로그인 성공 메시지 출력
	//3. 회원 탈퇴
	//  -> 아이디 비번 확인 후 회원 정보 삭제
	// 	**********************************
	//	회원가입, 로그인, 회원탈퇴 메소드 나눠서 생성
	//
	// !! 가능한곳까지 해보고 물어보시면 알려드립니다. !!
	
	// 결과만 실행 되면 됩니다.  homework10이랑 비슷한 문제.
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		KwonWork01 obj = new KwonWork01();
		obj.process();
	}

	public void process() {

		int cur = 0;
		User[] userList = new User[100];
		String[] idArray = new String[100];
		User str;
		int age = 0;
		String name = "";
		String id = "";
		String pw = "";
		String tel = "";
		
		
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원탈퇴");
			System.out.println("4. 회원출력");
			System.out.println("5. 종료");
			
			int sel = sc.nextInt();
			
		if (sel == 1) {
			
			//회원가입
			
			// 1. 아이디 입력
			System.out.println("아이디를 입력하세요.");
			id = sc.next();
			
			
			
			for(int i=0; i<idArray.length; i++) {
				if(id==idArray[i]) {
					System.out.println("중복 아이디입니다. 아이디를 다시 입력하세요.");
					id = sc.next();
				}
			}
			
			// 아이디 중복 민강씨 답안
//			boolean idCheck = false;
//			 for (int i = 0; i < cur; i++) {
//	               if (userList[i] != null && userList[i].id.equals(id)) {
//	                  idCheck = true;
//	                  break;
//	               }
//	            }
//	            if (idCheck) {
//	               System.out.println("중복된 아이디입니다.");
//	               continue;

			
			
			// 2. 비밀번호 입력
			System.out.println("비밀번호를 입력하세요.");
			pw = sc.next();
			char[] pwArray = new char[pw.length()];
			
			for (int i=0; i<pw.length(); i++) {
				pwArray[i] = pw.charAt(i);
			}
			
			boolean Aboolean = false; // 소문자
			boolean Bboolean = false; // 대문자
			boolean Cboolean = false; // 특수문자
			
			while ((Aboolean == false || Bboolean == false || Cboolean == false)) {
				for (int i=0; i<pwArray.length; i++) {
					if(pwArray[i]>=97 && pwArray[i]<=122) {
						Aboolean = true;
//						System.out.println("Aboolean 의 값은 : "+Aboolean);
					}
					if(pwArray[i]>=65 && pwArray[i]<=90) {
						Bboolean = true;
//						System.out.println("Bboolean 의 값은 : "+Bboolean);
					}
					if(pwArray[i]>=33 && pwArray[i]<=47) {
						Cboolean = true;
//						System.out.println("Cboolean 의 값은 : "+Cboolean);
					}
				}
				
				// 3. 전화번호 입력
				System.out.println("전화번호를 입력하세요.");
				tel = sc.next();
				String[] telArray = new String[100];
				
				for(int i=0; i<telArray.length; i++) {
					if(tel==telArray[i]) {
						System.out.println("중복 전화번호입니다. 다시 입력하세요.");
						tel = sc.next();
					}
				}
				
				// 4. 이름 입력
				System.out.println("이름을 입력하세요.");
				name = sc.next();
				
				// 5. 나이 입력
				System.out.println("나이를 입력하세요.");
				age = sc.nextInt();
				
				
				// 회원가입 성공/실패 메시지
				if (Aboolean == true && Bboolean == true && Cboolean == true) {
					System.out.println("회원가입에 성공하였습니다.");
					
					// toString 호출해보기
					str = new User(id, pw, tel, name, age);
					
					// 배열에 입력값 넣기
					userList[cur++] = str;
					
					
				} else {
					System.out.println("회원가입에 실패하였습니다. 다시 입력하세요.");
					Aboolean = false;
					Bboolean = false;
					Cboolean = false;
					pw = sc.next();
				}
				pwArray = new char[pw.length()];
				for (int i=0; i<pw.length(); i++) {
					pwArray[i] = pw.charAt(i);
				}
			}

//			//sample ={Qa123} => {Q,a,1,2,3}
//			for (int i = 0; i < idArray.length; i++) {
//				if(sample[i] ) {Aboolean = true};
//				if(_) {Bboolean = true;}
//			}
//			if(Aboolean == true && Bboolean == true)
//			{
//				//회원가입 성공
//			}else {
//				//회원가입 실패
//			}
			
		}
		
//		// toString 호출해보기
//		str = new User(id, pw, tel, name, age);
//		
//		// 배열에 입력값 넣기
//		userList[cur++] = str;
//		for (int i = 0; i < userList.length; i++) {
//			System.out.println(userList[i]);
//		}
		
		
		
		if (sel == 2) {
			//로그인
			System.out.println("아이디를 입력하세요.");
			id = sc.next();
			System.out.println("비밀번호를 입력하세요.");
			pw = sc.next();
			
			boolean booleanId = false;
			boolean booleanPw = false;
			
			for(int i=0; i<cur; i++) {
				if (userList[i].id.equals(id)) {
					booleanId = true;
				}
				if (userList[i].password.equals(pw)) {
					booleanPw = true;
				}
			}
			if(booleanId && booleanPw) {
				System.out.println("로그인에 성공하였습니다.");
			} else {
				System.out.println("틀렸습니다. 다시 로그인해주세요");
			}



		}
		if (sel == 3) {
			//회원탈퇴

		}
		// sel=번호입력이 4일 때, user for문으로 전체 출력
		if(sel == 4) {
			for (int i = 0; i < cur; i++) {
				System.out.println(userList[i]);
			}
			boolean booleanData = false;
			for (int i=0; i<userList.length; i++) {
				if(userList[i]!=null) {
				} else {
					booleanData = true;
				}
			}
			if(booleanData = true) {
				System.out.println("데이터가 없습니다.");
			}

		}


		
		// sel=번호입력이 5일 때, 종료
		if(sel == 5) break;
		
		}
	}
}


//생성자
class User {
	String name;   		//이름
	int age;	  		//나이
	String id; 			//아이디
	String password; 	//비밀번호
	String telno; 		//전화번호
	
	
	public User (String id, String password, String telno, String name, int age) {
		this.id = id;
		this.password = password;
		this.telno = telno;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + ", id=" + id + ", password=" + password + ", telno=" + telno
				+ "]";
	}
	

}

