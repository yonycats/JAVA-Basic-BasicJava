package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	
	// 자바에서 데이터베이스 접속해보기
public class DBConn {
	
	private static Connection conn = null;

	
	public static Connection getConnection() {
		// DB접속을 위해서는 , url, user, pwd 3가지가 꼭 필요함
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "pc11_0";
//		String pwd = "java";
		
		// 다빈씨 DB로 접속해보기
		// 포트를 열어줘야 들어갈 수 있음, 그냥 들어가면 해킹, 방화벽을 열어줘야 함
		// 고급 보안이 포함된 방화벽 > 인바운드 > 새 규칙 > 포트 > 특정 로컬 포트 1521 > 다음다음 > 이름 설정 > 마침
		// 다른 사람의 방화벽과 포트에 접속이 가능함(사설 IP를 같이 쓰는 공유기가 같아야 함)
		String url = "jdbc:oracle:thin:@192.168.36.136:1521:xe";
		String user = "pc12_3";
		String pwd = "java";
		
		// 싱글톤 패턴 적용
		// conn에 값이 있는지 없는지 확인 > 1번만 연결이 되도록 하는 것
		if(conn == null) {
			// 임포트 > 글자 더블클릭 > F2 > Surround with try/catch
			try {
				// 빨간줄 > 두번째꺼 > Add catch clause to surrounding try
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
