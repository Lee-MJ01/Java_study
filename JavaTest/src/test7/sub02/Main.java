package test7.sub02;

import java.util.*;

class Product{
	private String prodId;
	private String prodName;
	private int price;
	private int quantity;
	
	public Product(String prodId, String prodName, int price, int quantity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품이름 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
	
}

class Computer extends Product{
	private String manufactor;

	public Computer(String prodId, String prodName, int price, int quantity, String manufactor) {
		super(prodId, prodName, price, quantity);
		this.manufactor = manufactor;
	}
	

	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("제조사 : " + manufactor);
	}
}

class Clothes extends Product{
	private String size;
	
	public Clothes(String prodId, String prodName, int price, int quantity, String size) {
		super(prodId, prodName, price, quantity);
		this.size = size;
	}


	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("사이즈 : " + size);
	}
}

public class Main {

	public static void main(String[] args) {
		// 컴퓨터 객체 생성
		Computer computer = new Computer("E001", "데스크탑", 150, 10, "삼성전자");
		computer.printProductInfo();
		System.out.println("----------------");
		
		// 의류 객체 생성
		Clothes tshirt = new Clothes("C001", "T-Shirt", 20, 50, "L");
		tshirt.printProductInfo();
		System.out.println("----------------");

	}

}
