package sub1;

public class Animal {
	
	public void move() {
		System.out.println("Animal move...");
	}
	
	public static void print() { 
		System.out.println("static은 출력 가능");
	}
	// 오버라이드를 위한 메서드
	public void hunt() {}
}
