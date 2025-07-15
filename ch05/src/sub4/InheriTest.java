package sub4;

/*
	날짜 : 2025/07/15
	이름 : 이민준
	내용 : 상속(Inheritance) 실습하기
*/

public class InheriTest {

	public static void main(String[] args) {
		
		// Car 상속 실습
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
		// StockAcoount 실습
		StockAcoount kb = new StockAcoount("KB증권", "101-22-0100", "이민준", 10000, "삼성전자", 10, 100000); 
		kb.deposit(1000000);
		kb.withdraw(50000);
		kb.buy(5, 80000);
		kb.show();
		
		kb.sell(5, 90000);
		kb.show();
		
		Doctor doctor = new Doctor("이민준", 25, "신경외과");
		doctor.work();
		Engineer engineer = new Engineer("이민준", 24, "자동차");
		engineer.work();
		
	}
	

}
