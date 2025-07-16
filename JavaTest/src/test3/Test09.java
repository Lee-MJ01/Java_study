package test3;

/*
	날짜 : 2025/07/16
	이름 : 이민준
	내용 : 추상클래스 연습문제
*/

abstract class Shape {
	public abstract void draw();
}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("draw Triangle!");
		
	}
	
}

class Circle extends Shape {

	@Override
	public void draw() {
		
		System.out.println("draw Circle!");
	}
	
}

public class Test09 {

	public static void main(String[] args) {
		Test09 here = new Test09();
		
		Circle c = new Circle();
		Triangle t = new Triangle();
		
		here.draw(c);
		here.draw(t);

	}
	public void draw(Shape obj) {
		obj.draw();
	}

}
