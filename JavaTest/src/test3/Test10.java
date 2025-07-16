package test3;

/*
	날짜 : 2025/07/16
	이름 : 이민준
	내용 : 추상클래스 연습문제
*/

interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller{

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		Buyer b = new Customers();
		Seller s = new Customers();
		
		b.buy();
		s.sell();

	}

}
