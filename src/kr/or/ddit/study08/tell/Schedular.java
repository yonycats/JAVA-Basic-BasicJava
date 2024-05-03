package kr.or.ddit.study08.tell;

// abstract와 interface는 거의 비슷함
// interface는 구현이 불가능하며, 모두 구현이 되지 않은 상태로만 만들 수 있음
// interface도 다형성이 지원되며, interface는 다중 상속이 가능함

public interface Schedular {
	
	void getNextCall();
	public void sendCallToAgent();
	
}
