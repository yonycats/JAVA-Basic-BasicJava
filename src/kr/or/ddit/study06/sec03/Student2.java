package kr.or.ddit.study06.sec03;

public class Student2 {
	String nation;
	String roomNo;
	String name;
	int age;
	String region;
	
	// 인자가 정해진 값이 있을 경우의 생성자 (nation과 roomNo가 정해져 있을 경우)
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
		roomNo = "306호";
		nation = "한국";
	}
	
	// 정해진 값(306호, 한국)의 생성자에서 값이 벗어난 경우, 생성자 추가 
	public Student2(String roomNo, String name, int age) {
		this.name = name;
		this.age = age;
		this.roomNo = roomNo;
		nation = "한국";
	}
	
	public Student2(String nation, String roomNo, String name, int age) {
		this.name = name;
		this.age = age;
		this.roomNo = roomNo;
		this.nation = nation;
	}

	
	@Override
	public String toString() {
		return "Student [nation=" + nation + ", roomNo=" + roomNo + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
