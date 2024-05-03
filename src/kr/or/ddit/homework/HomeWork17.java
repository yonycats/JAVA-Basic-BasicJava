package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	int cur = 0;
	Member[] memList = new Member[100];
	String[] banWord = { "fuck", "씨발", "병신", "바보", "sibal", "멍청이", "등신" };

	public void process() {
		while(true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			System.out.println("5. 종료.");
			int sel = sc.nextInt();
			if(sel==1) {
				addMember();
			}
			if(sel==2) {
				removeMember();
			}
			if(sel==3) {
				updateMember();
			}
			if(sel==4) {
				printMemberList();
			}
			if(sel==5) {
				break;
			}
		}
	}
	
	

	public void addMember() {
		// 클래스 안에서 에러 체크를 하지 않고 메서드 안에서 에러 체크 하는 이유
		// 실무에서는 외부에서 데이터를 가져오는 경우가 대부분이기 때문
		
		// id 입력시 4~8자 입력 받을것.
		
		Member memAdd = new Member();
		
		String id, pass, name, nickName;
		int age;
		
				while (true) {
					System.out.println("아이디를 입력하세요.");
					id = sc.next();
					try {
						idCheck(id);
						break;
					} catch (Exception e) {
						System.out.println("다시 쓰세요.");
					}
				}
				
				while (true) {
					System.out.println("패스워드를 입력하세요.");
					pass = sc.next();
					try {
						passCheck(pass);
						break;
					} catch (Exception e) {
						System.out.println("다시 쓰세요.");
					}
				}
				
				while (true) {
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					try {
						nameCheck(name);
						break;
					} catch (Exception e) {
						System.out.println("다시 쓰세요.");
					}
				}
				
				while (true) {
					System.out.println("닉네임을 입력하세요.");
					nickName = sc.next();
					try {
						nickNameCheck(nickName);
						System.out.println("dddddddddddddd");
						break;
					} catch (Exception e) {
						System.out.println("다시 쓰세요.");
					}
				}
	
				while (true) {
					Scanner scc = new Scanner(System.in);
					System.out.println("나이를 입력하세요.");
					try {
						age = scc.nextInt();
						ageCheck(age);
						break;
					} catch (Exception e) {
						System.out.println("다시 쓰세요.");
					}
				}

		memAdd.setId(id);
		memAdd.setPass(pass);
		memAdd.setName(name);
		memAdd.setNickName(nickName);
		memAdd.setAge(age);
		
		memList[cur++] = memAdd;
		System.out.println("성공했습니다.");
		System.out.println();

		// throws로 강제 에러 발생시키기
		// id 입력시 4~8자 입력
		// pass 입력시 4~8자 입력 
		// name 입력시 2~5자 입력 
		// nickName 2~8자 입력시 욕설등 금지어 체크 contace?
		// age 숫자 입력 체크
	}
	
	
	
	public void idCheck(String id) throws Exception {
		for (int i = 0; i < banWord.length; i++) {
			if (id.contains(banWord[i])) {
				System.out.println(id + " 은(는) 사용 금지어입니다.");
				throw new Exception();
			}
		}
		for (int i = 0; i < cur; i++) {
			if (memList[i] != null && memList[i].getId().equals(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력하세요.");
				throw new Exception();
			}
		}
		if (id.length() < 4 || id.length() > 8) {
			System.out.println("id는 4글자 이상, 8글자 이하만 가능합니다. 다시 입력하세요.");
			throw new Exception();
		}
	}
	
	
	
	public void passCheck(String pass) throws Exception {
			if (pass.length()<4 || pass.length()>8) {
				System.out.println("pass는 4글자 이상, 8글자 이하만 가능합니다.");
				throw new Exception();
			}
	}
	
	
	
	public void nameCheck(String name) throws Exception {
			if (name.length()<2 || name.length()>5) {
				System.out.println("이름은 2글자 이상, 5글자 이하만 가능합니다.");
				throw new Exception();
			}
	}
	
	
	
	public void nickNameCheck(String nickName) throws Exception {
		for (int i=0; i<banWord.length; i++) {
			if (nickName.contains(banWord[i])) {
				System.out.println(nickName + " 은(는) 사용 금지어입니다.");
				throw new Exception();
			}
		}
		if (nickName.length()<2 || nickName.length()>8) {
			System.out.println("닉네임은 2글자 이상, 8글자 이하만 가능합니다.");
			throw new Exception();
		}
		for (int i = 0; i < cur; i++) {
			if (memList[i] != null && memList[i].getNickName().equals(nickName)) {
				System.out.println("중복된 닉네임입니다. 다시 입력하세요.");
				throw new Exception();
			}
		}
	}

	
	
	public void ageCheck(int age) throws Exception {
		
			if (age <= 0 || age > 150) {
				System.out.println("0~150살 이내로 입력해주세요.");
				throw new Exception();
			}
		}
	
	
	
	public void removeMember() {
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
	}
	

	
	public void updateMember() {

		printMemberList();

		System.out.print("수정할 회원 번호 입력.");
		int numUp = sc.nextInt();
		Member memUpdate = memList[numUp-1];
		
		// 1. 아이디 수정
		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		memUpdate.setId(id);
		
		boolean idCheck = false;

		while(idCheck == false) {
			for (int i=0; i<cur; i++) {
				if (memList[i] != null && i!=numUp-1 && memList[i].getId().equals(id)) {
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
			for (int i = 0; i < banWord.length; i++) {
				if (id.contains(banWord[i])) {
					System.out.println(id + " 은(는) 사용 금지어입니다.");
				}
			}
			if (id.length() < 4 || id.length() > 8) {
				System.out.println("id는 4글자 이상, 8글자 이하만 가능합니다. 다시 입력하세요.");
			}
		}

		// 2. 패스워드 수정
		System.out.println("패스워드를 입력하세요.");
		String pass = sc.next();
		memUpdate.setPass(pass);
		
		if (pass.length()<4 || pass.length()>8) {
			System.out.println("pass는 4글자 이상, 8글자 이하만 가능합니다.");
		}

		// 3. 이름 수정
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		memUpdate.setName(name);
		
		if (name.length()<2 || name.length()>5) {
			System.out.println("이름은 2글자 이상, 5글자 이하만 가능합니다.");
		}

		// 4. 닉네임 수정
		System.out.println("닉네임을 입력하세요.");
		String nickName = sc.next();
		memUpdate.setName(nickName);
		
		boolean nickCheck = false;

		while(nickCheck == false) {
			for (int i=0; i<cur; i++) {
				if (memList[i] != null && i!=numUp-1 && memList[i].getId().equals(id)) {
					break;
				}
				if(!memList[i].getId().equals(id) && i!=numUp-1) {
					nickCheck = true;
				}
			}
			if (nickCheck == false) {
				System.out.println("중복된 닉네임입니다. 다시 입력하세요.");
				id = sc.next();
			}
			for (int i=0; i<banWord.length; i++) {
				if (nickName.contains(banWord[i])) {
					System.out.println(nickName + " 은(는) 사용 금지어입니다.");
				}
			}
			if (nickName.length()<2 || nickName.length()>8) {
				System.out.println("닉네임은 2글자 이상, 8글자 이하만 가능합니다.");
			}
		}
		
		// 5. 나이 수정
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		memUpdate.setAge(age);
		
		if (age <= 0 || age > 150) {
			System.out.println("0~150살 이내로 입력해주세요.");
		}
		
	}
	
	
	
	public void printMemberList() {
		int num = 0;
		
		for (int i = 0; i < cur; i++) {
			Member memPrint = memList[i];
			// get 메소드를 이용해서 출력하기 (toString 사용 X)
			
			memPrint.getId();
			memPrint.getPass();
			memPrint.getName();
			memPrint.getNickName();
			memPrint.getAge();
			System.out.println((++num) + "번\t" + "ID : " + memPrint.getId() + "\tPW : " + memPrint.getPass() + 
								"\t이름 : " + memPrint.getName() + "\t닉네임 : " + memPrint.getNickName() + "\t나이 : " + memPrint.getAge());
		} num = 0;
		System.out.println();
	}

	
	
}

class Member{
	private String id;
	private String pass;
	private String name;
	private String nickName;
	private int age;
	
	
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

