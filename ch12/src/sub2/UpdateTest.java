package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
	날짜 : 2025/07/25
	이름 : 이민준
	내용 : JDBC 실습
*/

public class UpdateTest {

	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "lee0216";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(host, user, pass);
			Statement stmt =  conn.createStatement();
			
			String sql = "update user1 set age=35 where user_id='j101'";
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}

}
