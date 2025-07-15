package sub6;

/*
	날짜 : 2025/07/15
	이름 : 이민준
	내용 : 다형성 실습
	
	다형성(Polymorphism)
	- 상속관계에서 부모클래스이 기능이 자식클래스에서 다양한 형태로 변하는 특징
	- 객체 생성할 때 타입 선언을 부모클래스 타입으로 선언(업캐스팅)
	- 다형성을 통해서 프로그래밍의 중복코드 줄이고 유연성 향상
*/

public class PolyTest {

	public static void main(String[] args) {
		
		// 다형성 - 자식 객체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger(); // 업캐스팅
		Animal shark = new Shark(); // 업캐스팅
		Eagle eagle = new Eagle(); 	// 다운캐스팅

		tiger.move();
		eagle.move();
		shark.move();
		
	}

}
