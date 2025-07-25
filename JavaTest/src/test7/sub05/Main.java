package test7.sub05;

import java.util.*;

interface Product{
	public String getName();
	public int getPrice();
}

class Clothes implements Product {

	private String name;
	private int price;
	
	public Clothes(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}
	
}

class Food implements Product {

	private String name;
	private int price;
	
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}
	
}

class Customer {

	private String uid;
	private String name;
	
	public Customer(String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}

	public String getUid() {
		return uid;
	}
	
	public String getName() {
		return name;
	}
}

class Order {

	private int orderNo;
	private Customer customer;
	private List<Product> products;
	private int totalPrice;

	public Order(int orderNo, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.customer = customer;
		totalPrice = 0;
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product p) {
		products.add(p);
		totalPrice += p.getPrice();
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public int getTotalAmount() {
		return totalPrice;
	}
}

class ShoppingMall{
	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String, List<Order>> customerOrders;
	
	public ShoppingMall() {
		customers = new ArrayList<Customer>();
		orders = new ArrayList<Order>();
		customerOrders = new HashMap<String, List<Order>>();
	}
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	public List<Order> getOrders() {
		return orders;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// 쇼핑몰 생성
		ShoppingMall shoppingMall = new ShoppingMall();
		
		// 고객 생성
		Customer customer1 = new Customer("A101", "김유신");
		Customer customer2 = new Customer("A102", "김춘추");
		
		// 고객 추가
		shoppingMall.addCustomer(customer1);
		shoppingMall.addCustomer(customer2);
		
		// 제품 생성
		Product tshirt = new Clothes("티셔츠", 15000);
		Product orange = new Food("오렌지", 3000);
		Product banana = new Food("바나나", 3500);
		
		// 주문 생성
		Order order1 = new Order(1, customer1);
		order1.addProduct(orange);
		order1.addProduct(tshirt);
		
		Order order2 = new Order(2, customer2);
		order2.addProduct(tshirt);
		order2.addProduct(banana);
		
		// 주문 추가
		shoppingMall.addOrder(order1);
		shoppingMall.addOrder(order2);
		
		// 모든 주문 출력
		List<Order> orders = shoppingMall.getOrders();
		for (Order order : orders) {
			System.out.println("주문번호 : " + order.getOrderNo());
			System.out.println("고객이름 : " + order.getCustomer().getName());
			System.out.println("주문금액 : " + "₩" + order.getTotalAmount());
			System.out.println("주문목록");
			
			for (Product product : order.getProducts()) {
				System.out.println(" - " + product.getName() + " ₩" + product.getPrice());
			}
			
			System.out.println();
		}
	}

}
