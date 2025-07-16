package sub7;

/*
	날짜 : 2025/07/16
	이름 : 이민준
	내용 : 추상클래스 실습
*/

public class AbstractTest {

	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성 불가
		/* Animal a = new Animal(); */
		
		Animal t = new Tiger();
		Animal e = new Eagle();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();

	}

}
