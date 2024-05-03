package kr.or.ddit.study06.sec03;

public class Point {
	int x;	
	int y;
	int z;

	// 기본 생성자 X => 좌표값이 없다는건 애초에 가정이 불가능하기 때문

	// 생성자 x y 파라미터로
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
}
