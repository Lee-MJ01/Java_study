package test4.sub5;

public class Subject {
	protected String subName;
	protected Student[] students;
	protected int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student s) {
		students[studentCount++] = s;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		for(int i = 0; i < studentCount; i++) {
			System.out.print(students[i].name +", "); 
		}
		System.out.println();
	}
	
	public String getName() {
		return subName;
	}


}
