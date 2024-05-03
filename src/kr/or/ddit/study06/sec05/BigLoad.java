package kr.or.ddit.study06.sec05;

public class BigLoad {
	private static BigLoad instance;

	private BigLoad() {
		// Thread.sleep(3000); 줄에 마우스 대고 F2를 누른 다음 두번째 줄 더블 클릭
		try {
			// 3000밀리세컨드 = 3초 = 3초동안 멈추겠다
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static BigLoad getInstance() {
		if (instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}
}
