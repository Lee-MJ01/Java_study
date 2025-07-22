package sub1;

public class FruitBox<T> { // 제네릭 클래스 FruitBox의 치환변수 T를 선언
	
	// 범용적으로 사용하지 못함
	// private Apple apple;
	// private Banana banana;
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	
}
