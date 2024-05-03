package kr.or.ddit.study06.sec05;

public class SingleTon {
	// 템플릿으로 만듬 => 프로젝트 때 계속 쓸거라서, 프로젝트 때 DB에 계속 접속해야 되기 때문에
	// 싱글톤 쓰는 이유 1. 
	
	// SingleTon 타입의 instance 변수 선언
	private SingleTon instance;
	
	// 외부에서 Reserve 클래스의 인스턴스를 직접적으로 생성할 수 없도록 하기 위한 것
	// 해당 클래스의 생성자를 private으로 선언하여 외부에서 직접적으로 인스턴스를 생성하지 못하도록 함
	// 이렇게 하면 외부에서 new Reserve()와 같이 직접 생성자를 호출할 수 없으며, 
	// getInstance() 메서드를 통해서만 인스턴스를 얻을 수 있음
	private SingleTon() {
		
	}
	
	private SingleTon getInstance() {
		// private 클래스 사용방법
		// 인스턴스의 값이 비어있으면, 인스턴스에 싱글톤 클래스의 주소값을 넣음
		if(instance == null) {
			instance = new SingleTon();
		}
		// 이미 싱글톤 클래스의 주소값이 들어가있기 때문에 계속 같은 주소값을 반환함
		// 데이터베이스의 접속을 1개로 유지하기 위해서 이런 싱글톤 방식을 사용
		return instance;
	}
	
	
	
}



