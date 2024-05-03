package kr.or.ddit.study06.sec06;

public class AccessMain {
	public static void main(String[] args) {
		AccessPrivate ap = new AccessPrivate();
		
		AccessDefault as = new AccessDefault();
		int a = as.a;
		as.defaultMethod1();
		
		AccessDefault ap2 = new AccessDefault();
		int a2 = ap2.a;
		
		
		
		
		
	}

}
