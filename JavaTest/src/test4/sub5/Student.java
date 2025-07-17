package test4.sub5;

public class Student {
	protected String name;
	protected String studentId;
	protected Subject[] subjects;
	protected int[] scores;
	protected int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject s) {
		subjects[subjectCount] = s;
		subjects[subjectCount].addStudent(this);
		System.out.printf("%s - %s 과목 신청완료\n", name, subjects[subjectCount++].subName);
		
	}
	
	public void setScore(Subject s, int a) {
		for(int i = 0; i < subjectCount; i++) {
			if(subjects[i].subName == s.subName) {
				scores[i] = a;
				System.out.printf("%s - %s 점수 입력완료\n", name, subjects[i].subName);
			}
		}	
	}
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		for(int i = 0;i < subjectCount; i++) {
			System.out.printf(" - %s:%d\n",subjects[i].subName,scores[i]);
		}
	}
	public String getName() {
		return this.name;
	}
}












