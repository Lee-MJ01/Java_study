package sub2;

/*
	날짜 : 2025/07/24
	이름 : 이민준
	내용 : 자바 Thread interrupt 실습
	
	sleep 상태의 스레드를 interrupt 시키면 InterruptedException 예외 발생
	
	sleep 상태 : 일시정지 상태
*/

class SubThread extends Thread{
	@Override
	public void run() {
		int i = 1;
		
		try {
			while(true) {
				System.out.println("SubThread - " + i);
				i++;
				Thread.sleep(1000); 
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class ThreadinterruptTest {

	public static void main(String[] args) {
		SubThread sub = new SubThread();
		
		// 작업 스레드 실행
		sub.start();
		
		try { // 메인 스레드 5초 대기
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료...");

	}

}








