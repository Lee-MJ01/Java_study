package sub2;

/*
	날짜 : 2025/07/24
	이름 : 이민준
	내용 : 자바 Thread state 실습

	main Thread가 종료되었는데 실행되는 sub Thread는 Zombie Thread라고 함.
	=> Join을 하지 않으면 Zombie가 됨.
	
*/

class WorkThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("WorkThread - "+ i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinTest {

	public static void main(String[] args) {
		WorkThread work = new WorkThread();
		
		// 작업 스레드 실행
		work.start();
		
		// 작업 스레드 종료 대기
		try {
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");

	}

}









