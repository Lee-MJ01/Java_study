package sub1;

public class Apple extends Object{ // 자바의 모든 클래스는 암묵적으로 Object를 상속(그래서 따로 명시하지 않아도 됨)
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	
}
