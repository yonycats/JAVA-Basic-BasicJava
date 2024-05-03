package kr.or.ddit.study07.sec02.tell.copy;

// 4. 자식 클래스가 추상 클래스를 상속받을 때에는 추상 메서드를 반드시 완성해줘야 함
// 추상 클래스는 new가 불가능함
public class RoundRobn extends Schedular{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 대기열에서 차례대로 가져옴");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("차례대로 상담원에게 상담전화를 분배");
	}
}