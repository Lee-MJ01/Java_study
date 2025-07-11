package sub2;

/*
	날짜 : 2025/07/08
	이름 : 이민준
	내용 : 자료구조 Queue 실습
*/

public class QueueTest {

	public static void main(String[] args) {
		int[] queue = new int[5];
		
		int front = 0;
		int rear = 0;
		
		// data enqueue
		queue[rear++] = 10;
		queue[rear++] = 20;
		queue[rear++] = 30;
		queue[rear++] = 40;
		queue[rear++] = 50;
		for(int num: queue ) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
		
		// data dequeue
		int removed = queue[front++];
		System.out.println("삭제 값 : " + removed);
		
	}

}








