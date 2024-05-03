package kr.or.ddit.study06.sec05;

public class StudentExample {
	
	static int a= 10;
	int b = 20;
	
	
	public static void main(String[] args) {
		Student s1 = new Student("김민강", 20);
		Student s2 = new Student("서지윤", 20);
		s1.age = 24;
		
		// year 변수가 아래에 있는데도 부를 수 있는 이유는
		// new 클래스에 이미 포함되어 있기 때문임
		System.out.println(Student.year +" "+ s1.toString());
		System.out.println(Student.year +" "+ s2.toString());
		
		
		// static 값을 변경하면, 지정하지 않은 변수의 값도 같이 공유됨
		s1.year++;
	

		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.year +" "+ s1.toString());
		System.out.println(s2.year +" "+ s2.toString());
		

		StudentExample se = new StudentExample();
		int b = se.b;
		
	}
	
	
	
	
	
}
