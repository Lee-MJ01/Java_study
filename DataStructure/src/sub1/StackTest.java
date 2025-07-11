package sub1;

/*
	날짜 : 2025/07/08
	이름 : 이민준
	내용 : 자료구조 Stack 실습
*/

public class StackTest {

	public static void main(String[] args) {
		int[] stack = new int[5];
		int top = 0; // top point 위치
		
		// 10 push
		stack[top] = 10;
		top++;
		
		// push
		stack[top++] = 20;
		stack[top++] = 30;
		stack[top++] = 40;
		stack[top++] = 50;
		
		// print
		System.out.println("현재 top: " + top);
		
		for(int i = 0; i < stack.length; i++ ) {
			System.out.println("stack["+i+"] :" + stack[i]);
		}
		
		// data drop
		int removed = stack[--top];
		System.out.println("삭제 데이터 : " + removed);
		
		System.out.println("삭제 데이터 : " + stack[--top]);

	}

}
