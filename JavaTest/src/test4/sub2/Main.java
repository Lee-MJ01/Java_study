package test4.sub2;

public class Main {

	public static void main(String[] args) {
		Product pro = new Product("P001", "키보드", 35000, 10);
		
		pro.printProductInfo();
		System.out.println("============");
		
		pro.updateProce(30000);
		System.out.println("============");
		
		pro.printProductInfo();
		System.out.println("============");
		
		pro.addStock(5);
		System.out.println("============");
		
		pro.printProductInfo();
		System.out.println("============");
	}

}
