package sub3;

/*
	날짜 : 2025/07/21
	이름 : 이민준
	내용 : 자바 StringBuilder 클래스 실습
*/

public class StringBuilderTest {
	public static void main(String[] args) {
		// String의 불변성(Immutable)
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "Programming"; // 변경할 때마다 다른 힙 저장소에 저장됨(메모리 낭비, 과부화)
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		System.out.println(str);
		
		// 빈번한 문자열 변경을 위한 StringBuilder
		StringBuilder sb = new StringBuilder("java");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming"); // 변경해도 같은 주소값을 가짐
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		System.out.println(sb);
		
		// 빈번한 문자열 변경을 위한 StringBuffer => StringBuilder와 비슷한 기능을 가짐
		StringBuffer sbf = new StringBuffer("java");
		System.out.println("sb 주소 : " + System.identityHashCode(sbf));
		
		sbf.append("Programming"); // 변경해도 같은 주소값을 가짐
		System.out.println("sb 주소 : " + System.identityHashCode(sbf));
		
		System.out.println(sbf);
	}
}
