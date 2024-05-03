package kr.or.ddit.study05.sec03;

public enum Week {
	// enum 파일
	MON("월요일"), TUE("화요일"), WED("수요일"), THU("목요일"), FRI("금요일"), SAT("토요일"), SUN("일요일");
	
	
	
	// 아래부터는 enum의 활용 방법
	// 99%의 상황은 위의 열거까지만 사용함
	String day;
	Week(String day) {
		this.day = day;
	}
	
	
}
