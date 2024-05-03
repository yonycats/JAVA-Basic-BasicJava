package kr.or.ddit.study02.sec03;

public class TypeChange3 {
	public static void main(String[] args) {
		String str = "10";
		
		// 문자를 정수로 변환하는 함수
		int num = Integer.parseInt(str);
		System.out.println(num+3);
		
		// String -> 기본타입
		// 기본타입(대문자).parse기본타입();
		// Long.parseLong();
		// Double.parseDouble();
		// integer.parseInt();
		
		//String -> byte
		String str1 = "10";
		byte b1 = Byte.parseByte(str1);
		System.out.println("String->byte "+b1);
		
		//String -> short
		String str2 = "100";
		short s1 = Short.parseShort(str2);
		System.out.println("String->Short "+s1);
		
		//String -> int
		String str3 = "10000";
		int i1 = Integer.parseInt(str3);
		System.out.println("String->int "+i1);
		
		//String -> long
		String str4 = "10000";
		long l1 = Long.parseLong(str4);
		System.out.println("String->long "+l1);
		
		//String -> float
		String str5 = "0.05";
		float f1 = Float.parseFloat(str5);
		System.out.println("String->float "+f1);
		
		//String -> double
		String str6 = "2.11";
		Double d1 = Double.parseDouble(str6);
		System.out.println("String->double "+d1);
	}
}
