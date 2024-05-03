package kr.or.ddit.study06.sec03;

public class Student {
	String nation;
	String roomNo;
	String name;
	int age;
	
	// 인자가 정해진 값이 있을 경우의 생성자 (nation과 roomNo가 정해져 있을 경우)
	public Student(String name, int age) {
//		nation = "한국";		
//		roomNo = "306호";		
//		this.name = name;
//		this.age = age;
		
		// 생성자에서 중복된 코드를 줄이는 방법
		this("306호", name, age);	// => 인자가 3개인 생성자를 호출
		System.out.println("파라미터 2개 생성자");
	}
	
	// 정해진 값(306호, 한국)의 생성자에서 값이 벗어난 경우, 생성자 추가 
	public Student(String roomNo, String name, int age) {
//		nation = "한국";		
//		this.roomNo = roomNo;
//		this.name = name;
//		this.age = age;
		
		// 생성자에서 중복된 코드를 줄이는 방법
		this("한국", roomNo, name, age);	// => 인자가 4개인 생성자를 호출
		System.out.println("파라미터 3개 생성자");
	}
	
	public Student(String nation, String roomNo, String name, int age) {
		this.nation = nation;
		this.roomNo = roomNo;
		this.name = name;
		this.age = age;
		
		System.out.println("파라미터 4개 생성자");
	}
	
	
	
	@Override
	public String toString() {
		return "Student [nation=" + nation + ", roomNo=" + roomNo + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
