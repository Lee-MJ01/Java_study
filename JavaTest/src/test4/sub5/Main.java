package test4.sub5;

import test4.sub4.Book;
import test4.sub4.Member;

public class Main {

	public static void main(String[] args) {
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		
		Student st1 = new Student("김유신", "S001");
		Student st2 = new Student("김춘추", "S002");
		
		st1.enrollSubject(java);
		st1.enrollSubject(database);
		System.out.println("============================");
		
		st2.enrollSubject(java);
		st2.enrollSubject(database);
		System.out.println("============================");
		
		st1.setScore(java, 96);
		st1.setScore(database, 90);
		System.out.println("============================");
		
		st2.setScore(java, 86);
		st2.setScore(database, 76);
		System.out.println("============================");
		
		java.printSubjectInfo();
		System.out.println("============================");
		
		database.printSubjectInfo();
		System.out.println("============================");
		
		st1.printStudentInfo();
		System.out.println("============================");
		
		st2.printStudentInfo();
		System.out.println("============================");

	}

}
