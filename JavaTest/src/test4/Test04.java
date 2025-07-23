package test4;

/*
	날짜 : 2025/07/23
	이름 : 이민준
	내용 : 문자열 문제
*/

public class Test04 {

	public static void main(String[] args) {
		String fileName = "HelloWorld.java";
		
		int idx = fileName.length();
		String title = fileName.substring(0, idx-5);
		String ext = fileName.substring(11, idx);
		
		System.out.println("파일명 : "+ title);
		System.out.println("확장자 : "+ ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(", ");
		
		int total = 0;
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		System.out.println("strScores 총점 : " + total);

	}

}
