package sub2;

/*
 	날짜 : 2025/07/07
 	이름 : 이민준
 	내용 : 자바 변수 자료형 실습하기 
*/

public class DataTypeTest {

	public static void main(String[] args) {
		
		//정수형
		byte num1 = 127; 						// 1byte 해당 자료형 최대수
		short num2 = 32767;						// 2byte 해당 자료형 최대수
		char num3 = 97;							// 2byte 해당 자료형 최대수
		int num4 = 2147483647;					// 4byte 해당 자료형 최대수
		long num5 = 9_223_372_036_854_775_807L;	// 8byte 해당 자료형 최대수
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		//실수형
		float var1 = 0.123456789f; 			// 4byte
		double var2 = 0.123456789123456789; // 8byte, 대중적 사용
		
		System.out.println("var1 : " + var1); // 소수점 최대  8자리 출력
		System.out.println("var2 : " + var2); // 소수점 최대 17자리 출력
		
		//논리형
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		//문자형
		char c1 = 'A';
		char c2 = '쀏'; // 자음 또는 모음 또는 한글자
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		int n1 = c1; // char 자료형은 정수형 타입이기에 int 형으로 대입가능
		System.out.println("n1 : " + n1);
		
		//문자열 앞 자리 대문자
		String s1 = "A"; // char 자료형은 ''로 정의, String 자료형은 ""로 정의
		String s2 = "가";
		String s3 = "Apple";
		String s4 = "가을";
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
	}

}