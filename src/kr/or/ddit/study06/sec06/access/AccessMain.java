package kr.or.ddit.study06.sec06.access;

import kr.or.ddit.study06.sec06.AccessDefault;
import kr.or.ddit.study06.sec06.AccessPrivate;
import kr.or.ddit.study06.sec06.AccessProtect;
import kr.or.ddit.study06.sec06.AccessPublic;

public class AccessMain {
	public static void main(String[] args) {
		AccessPrivate ap = new AccessPrivate();
		
		AccessDefault as = new AccessDefault();
//		int a = as.a;
//		as.defaultMethod1();
		
		
		AccessProtect ap2 = new AccessProtect();
//		int a2 = ap2.a;
		

		AccessPublic ap3 = new AccessPublic();
		int a3 = ap3.a;
		ap3.publicMethod();
	}
}
