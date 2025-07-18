package p189;

/*
	날짜 : 2025/07/18
	이름 : 이민준
	내용 : 교재 p189 예제 실습
*/

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println(">> ");
		r.width = sc.nextInt();
		r.height = sc.nextInt();
		System.out.println("사각형의 면적은 " + r.getArea());
		sc.close();

	}

}
