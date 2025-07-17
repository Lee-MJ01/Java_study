package test4.sub1;

public class Main {

	public static void main(String[] args) {
		StudentScore stu = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		stu.printStudentInfo();
		System.out.println("================");
		
		stu.updateScore(98.0);
		System.out.println("================");
		
		stu.updateScore(102.0);
		System.out.println("================");
		
		stu.printStudentInfo();
		System.out.println("================");

	}

}
