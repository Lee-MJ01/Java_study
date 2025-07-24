package sub3;

/*
	날짜 : 2025/07/24
	이름 : 이민준
	내용 : 자바 Thread 동기화(Synchronize) 실습

	동기화 기법 :
	- 상호배제
	- 세마포어
	
	Synchronized 메서드를 만들면 알아서 임계영역을 만듦
	임계영역을 만들어 여러 개의 스레드가 와도 안정적이게 수행
	
	세마포어 방식도 알아보기
*/

public class ThreadSynctTest {

	public static void main(String[] args) throws InterruptedException {
		Count count = new Count();
		
		CountThread c1= new CountThread(count);
		CountThread c2= new CountThread(count);
		CountThread c3= new CountThread(count);
		
		c1.start();
		c2.start();
		c3.start();

		c1.join();
		c2.join();
		c3.join();
		
		System.out.println("최종 결과 : " + count.getNum());
		
	}

}
