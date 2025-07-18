package p191;

/*
	날짜 : 2025/07/18
	이름 : 이민준
	내용 : 교재 p191 예제 실습
*/

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "";
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pi = new Circle(10, "자바피자");
		
		double area = pi.getArea();
		System.out.println(pi.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
