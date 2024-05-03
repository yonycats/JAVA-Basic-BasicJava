package kr.or.ddit.study06.sec02;

public class Food {
	String year = "2024.04.15";
	String name;
	int price;
	
	
	// 위에 값이 있어도 아래 값이 출력됨
	{
		year = "2024.04.01";
	}
	
	
	
	// toString
	
//	@Override
//	public String toString() {
//		return "Food [year=" + year + ", name=" + name + ", price=" + price + "]";
//	}

	@Override
	public String toString() {
		return "제조일자 : "+year+", 이름 : "+name+", 가격 : "+price;
	}
	
	
	// alt +shift + s
//	to string 메서드 단축키
	
}
