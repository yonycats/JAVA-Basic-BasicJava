package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBMain {
	public static void main(String[] args) {
		DBMain obj = new DBMain();
		obj.process();
	}
	
	public void process() {
		
		Connection conn = null;  // DB접속
		Statement stmt = null;   //Query 날림
		ResultSet rs = null;     //Query 응답
		
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				// 컬럼으로 갖고 오는 것
				// rs.getString(컬럼 인덱스 : 컬럼 몇번째인 것, 컬럼 라벨 : 컬럼명)
				String id = rs.getString("mem_id");
				String name = rs.getString("mem_name");
				String addr = rs.getString("mem_job");
				String job = rs.getString("mem_job");
				// 해당하는 직업만 출력하기, if문 사용
				if(!job.equals("주부")) continue;
				String mail = rs.getString("mem_mail");
				System.out.println(id+"\t"+name+"\t"+addr+"\t"+job+"\t"+mail);
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
