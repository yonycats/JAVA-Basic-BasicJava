package kr.or.ddit.study06.sec03;

public class Triangle {
	Point p1;
	Point p2;
	Point p3;
	
	double area;
	
	// 기본 생성자 X => 클래스명이 삼각형인데, 
	// 인자가 3개가 아니면 의미가 없기 때문에 기본 생성자는 존재하지 않음
	
	// 1. Point를 p1, p2, p3을 파라미터로 하는 생성자 만들기
	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		
		area = ((p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) -
				(p1.x * p3.y + p2.x * p1.y + p3.x * p1.y))/2.0;
		
		area = Math.abs(area);
//		if (area<0) area = -area;
	}
	
	
	// 2. int x1, y1, x2, y2, x3, y3을 파라미터로 사용하는 생성자
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//		this.p1 = new Point(x1, y1);
//		this.p2 = new Point(x2, y2);
//		this.p3 = new Point(x3, y3);
		
		// 아래처럼 작성해서 1번의 넓이 구하는 공식을 호출하여 넓이도 함께 출력할 수 있음
		this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
	}
	
	
	@Override
	public String toString() {
//		return "("+p1.x+", "+p1.y+"), "+"("+p2.x+", "+p2.y+"), "+"("+p3.x+", "+p3.y+"), ";
		return p1 + ", " + p2 + ", " + p3;
	}
}
