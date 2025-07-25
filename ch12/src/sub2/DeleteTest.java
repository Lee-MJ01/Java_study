package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
	날짜 : 2025/07/25
	이름 : 이민준
	내용 : JDBC 실습
*/

public class DeleteTest {

	
	
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "lee0216";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			// 데이터베이스 연결
			conn = DriverManager.getConnection(host, user, pass);
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			// SQL 실행
			String sql = "delete from user1 where user_id='j102'";
			stmt.executeUpdate(sql);
			// 결과 처리
			
			// 데이터베이스 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");

	}

}
