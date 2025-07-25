package sub2;

/*
 	날짜 : 2025/07/07
 	이름 : 이민준
 	내용 : Java 다양한 출력 실습
 */

public class PrintTest {
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!"); // 한줄 복사 ctrl + alt + 방향기 아래(또는 위)
		System.out.println("Hello Korea!"); // 한줄 삭제 ctrl + d
		System.out.println("Hello Busan!"); // 작업취소 ctrl + z
		
		// 한줄 출력
		System.out.print("Welcome"); // ln(줄바꿈 == 개행) 처리가 안되기에 그 다음 출력문이 바로 이어서 출력된다.
		System.out.print("Java!");
		
		// 개행 출력
		System.out.println(); // 줄바꿈 
		System.out.print("Welcome\n"); // \n : 개행처리 이스케이프 특수문자
		System.out.print("Korea!"); 
		
		
	}
}
