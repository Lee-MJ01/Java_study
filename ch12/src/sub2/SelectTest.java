package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
	날짜 : 2025/07/25
	이름 : 이민준
	내용 : JDBC 실습
*/


public class SelectTest {

	public static void main(String[] args) {
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "lee0216";
		final String PASS = "1234";
		
		// 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();
		
		try {
			// 데이터베이스 생성
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "SELECT * FROM USER1";
				// select문은 executeQuery()으로 실행하고 ResultSet으로 반환
			ResultSet rs = stmt.executeQuery(sql);			
			
			// 결과처리(일반적으로 리스트 생성)
			while(rs.next()) { // cursor를 다음 row로 이동시킴, 이동할 row가 없으면 false
				
				// 커서가 가리키는 row의 각 컬럼값을 추출해서 VO객체 초기화
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));// 1부터 시작, 0 아님
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				// 리스트에 테이블 내용(1row씩) 삽입
				users.add(vo);
			}
			
			// 데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 리스트 출력
		for(User1VO user : users) {
			System.out.println(user);
		}
		
		System.out.println("select 완료...");
	}

}
