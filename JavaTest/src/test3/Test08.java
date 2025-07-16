package test3;

/*
	날짜 : 2025/07/16
	이름 : 이민준
	내용 : 다형성 연습문제
*/

class Product {
	protected String proName;
	protected int price;
	
	public Product(String proName, int price) {
		this.proName = proName;
		this.price = price;
	}
	public void spec() {}
}

class SmartPhone extends Product {

	public SmartPhone(String proName, int price) {
		super(proName, price);
	}
	
	@Override
	public void spec() {
		System.out.println("================");
		System.out.println("제품명 : "+ proName );
		System.out.println("제품가격 : "+ price );
	}
	
}

class Computer extends Product {

	public Computer(String proName, int price) {
		super(proName, price);
	}
	
	@Override
	public void spec() {
		System.out.println("================");
		System.out.println("제품명 : "+ proName );
		System.out.println("제품가격 : "+ price );
	}
}
public class Test08 {

	public static void main(String[] args) {
		Product p1 = new SmartPhone("갤럭시", 100);
		Product p2 = new Computer("맥북프로", 200);

		p1.spec();
		p2.spec();
	}

}
