package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
	날짜 : 2025/07/25
	이름 : 이민준
	내용 : preparedStatement 실습
*/

public class ProparedInsertTest {

	public static void main(String[] args) {

		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "lee0216";
		final String PASS = "1234";
		
		try {
			// 데이터베이스 생성
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// SQL 실행 객체 생성(PreparedStatement)
			String sql = "insert into user1 values (?,?,?,?)"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "P101");
			psmt.setString(2, "이민준");
			psmt.setString(3, "010-2109-8237");
			psmt.setInt(4, 25);
			
			// SQL 실행
				// insert, delete, update는 모두 executeUpdate() 실행
			psmt.executeUpdate(); 
			
			// 결과 처리(select 일 경우)
			// 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("insert 완료...");
	}
	

}
