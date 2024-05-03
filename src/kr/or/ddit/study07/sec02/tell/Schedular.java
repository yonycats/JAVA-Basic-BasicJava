package kr.or.ddit.study07.sec02.tell;

// 4. 자식 클래스가 추상 클래스를 상속받을 때에는 추상 메서드를 반드시 완성해줘야 함
// 추상 클래스는 new가 불가능함
public abstract class Schedular {
	
	// 1. abstract : 추상화 메서드, 메서드에 아무것도 없으니 
	// 자식 클래스에서 상속받아서 구현하라는 것
	abstract void getNextCall();
	abstract public void sendCallToAgent();
	
	
	
	
	
	// 2. 이렇게 추상 메서드는 반반 섞는 것도 가능함
//	public void getNextCall() {
//		
//	}
//	abstract public void sendCallToAgent();
	
	
	
	
	
	// 3. 안에 내용이 아무것도 없음 => 구현이 되고 있지 않다 
	// 메소드에 구현할 내용이 없을때는 추상화를 함
//	public void getNextCall() {
//		
//	}
//	
//	public void sendCallToAgent() {
//		
//	}
	
	
	
}
