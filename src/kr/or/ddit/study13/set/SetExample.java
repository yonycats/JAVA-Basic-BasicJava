package kr.or.ddit.study13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
 * HashSet
 * 	key 로 이루어짐
 * 	key 값은 중복을 허용하지 않고 순서가 보장되지 않음.
 * 
 * 	Set 타입의 대표 컬렉션
 * 
 * 	주요 메소드
 * 	.add() 		: 값 추가
 * 	.remove() 	: 값삭제
 * 	.contains() : 포함 여부
 * 	.iterator() : 전체 출력을 위한 이터레이터
 */

// HashSet은 순서가 보장이 되지 않기 때문에 HashSet을 꺼내기 위한
// Iterator가 필요함


public class SetExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SetExample obj = new SetExample();
		obj.process();
	}
	
	
	
	public void process() {
		Set<Integer> set = new HashSet();
		// 해시로 로또 완성
		
		while(set.size()<6) {
			set.add(new Random().nextInt(45)+1);
		}
	}
	


//	public void process() {
//		Set set = new HashSet();
//		// "가" key 값이 하나만 출력됨 => key 값은 중복이 허용되지 않기 때문
//		set.add("가");
//		set.add("가");
//		set.add("가");
//		set.add("나");
//		set.add("다");
//		set.add("라");
//		set.add(1);
//		set.add(2);
//		set.add(5);
//		set.add(10.4);
//
//		set.remove("나");
//
//		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	

