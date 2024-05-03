package kr.or.ddit.study06.sec05;

public class SingleTon2 {

	private static SingleTon2 instance;

	private SingleTon2() {

	}

	public static SingleTon2 getInstance() {
		if (instance == null) {
			instance = new SingleTon2();
		}
		return instance;
	}
}



