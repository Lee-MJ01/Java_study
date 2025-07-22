package sub5;

/*
	날짜 : 2025/07/22
	이름 : 이민준
	내용 : 자바 Math 실습
 */

public class MathTest {

	public static void main(String[] args) {
		// Math math = new Math();
		// => 이렇게 못함. static method만 가지고 있음
		// final class라 상속도 못받음
		
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("절대값 : " + Math.abs(5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("제곱근 : " + Math.sqrt(16));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("올림값 : " + Math.floor(1.2));
		System.out.println("올림값 : " + Math.floor(1.8));
		System.out.println("반올림값 : " + Math.round(1.2));
		System.out.println("반올림값 : " + Math.round(1.8));
		
		// random : 임의의 수
		double num1 = Math.random();
		System.out.println("num1 : "+ num1); // 0 ~ 1사이의 실수 랜덤 출력
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0 ~ 10사이의 실수 랜덤 출력
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1 ~ 10사이의 정수 랜덤 출력
		
		double rand = Math.ceil(Math.random() * 46); // 1 ~ 46까지 임의의 정수
		System.out.println("rand : " + rand);
		
	}

}













