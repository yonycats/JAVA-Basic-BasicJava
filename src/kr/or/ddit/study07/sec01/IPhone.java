package kr.or.ddit.study07.sec01;

public class IPhone extends SmartPhone{
	
	public void apstore() {
		System.out.println("앱스토어 사용");
	}
	
	public void internet() {
		System.out.println("인터넷 사용");
	}
	
	// 오버라이딩
	// 자바는 오브젝트(개발된 최상위 부모 클래스) 기반, 대표적인 오브젝트 => toString 등
	// 오버라이딩 대표적 => toString
	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("1000만 화소 카메라");
		super.camera();
	}
	
	// IPhone2 클래스 만들고 IPhone 상속받기
	// camera 2000만 화소로 업그레이드 하기
	
}


