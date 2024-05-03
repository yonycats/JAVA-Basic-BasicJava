package kr.or.ddit.study13.list;

import java.util.Stack;

public class ArrayTest {
	// 배열의 불편한 점
	// 1. 크기를 먼저 지정해야한다

	String[] array;
	int cur;

	
	
	public ArrayTest() {
		array = new String[10];
	}

	// 사이즈 지정
	public ArrayTest(int size) {
		array = new String[size];
	}
	
	

	// 실제 값이 들어간 크기
	public int size() {
		return cur;
	}

	
	
	// .add			: 데이터 삽입
	public void add(String str) {
		if (cur == array.length) {
			String[] temp = new String[array.length + 10];
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[cur++] = str;
	}
	
	
	
	// .get			: idx 자료 반환
	public String get(int index) {
		return array[index];
	}
	
	
	
	// .remove		: idx 자료 반환 후 삭제
	// 삭제하고 끝나는 것이 아닌 값을 가져올 수 있음
	public String remove(int index) {
		String result = array[index];
		
		String[] temp = new String[array.length];
		int add = 0;
		for (int i=0; i<cur; i++) {
			if (i == index) add++;
			temp[i] = array[i+add];
		}
		array = temp;
		
		return result;
	}
	
	
	
	// .contains	: 포함 여부 확인
	public boolean contains(String search) {
		for (String s : array) {
			if (s.equals(search))
				return true;
		}
		return false;
	}
	
	
}
