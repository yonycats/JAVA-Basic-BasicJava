package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList
		// - 1차원 배열 구조
		// - 중복을 허락하고 순서화 제공
		// - List 타입의 컬렉션
		// List의 장점 : 배열과 다르게 공간의 크기를 미리 정하지 않아도 됨, 객체 삭제 시 인덱스가 자동으로 앞으로 1씩 당겨짐
		
		// 주요 메서드
		// .add			: 데이터 삽입
		// .clear		: 모든 데이터 삭제
		// .contains	: 포함 여부 확인
		// .get			: idx 자료 반환
		// .remove		: idx 자료 반환 후 삭제
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		// 3번 배열 값 지우기, 메서드로 편하게 삭제 가능
		list.remove(2);
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
