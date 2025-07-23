package sub3;

import java.io.FileOutputStream;
import java.util.Properties;

/*
	날짜 : 2025/07/23
	이름 : 이민준
	내용 : 프로퍼티스 자료구조 실습 : 직렬화를 위한 자료구조
*/

public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로터피 : key-value가 모두 문자열인 자료구조(=Map<String, String> map = new HashMap())
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 직렬화(엄밀히 따지면 직렬화는 아님)
		String path = "C:\\Users\\GGG\\Desktop\\fruit.properties"; // 확장자가 properties
		
		try {
			
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
	}

}
