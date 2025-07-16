package sub8;

/*
	날짜 : 2025/07/16
	이름 : 이민준
	내용 : 인터페이스 실습
*/

public class InterfaceTest {

	public static void main(String[] args) {
		
		// 인터페이스 역할1 - 통일된 표준 클래스 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		RemoteControl s = new RemoteSamsung();
		s.powerOn();
		s.chUp();
		s.soundUp();
		s.powerOff();
		
		// 인터페이스 역할2 - 결합도 완화(유연성)
		Bulb b = new Bulb();
		Socket socket = new Power(b);
		
		socket.swichOn();
		socket.swichOff();
		
		// 인터페이스 역할3 - 다중상속 효과 (잘 안 씀)
		SmartTv stv = new SmartTv();
		stv.process();
		
		
	}

}








