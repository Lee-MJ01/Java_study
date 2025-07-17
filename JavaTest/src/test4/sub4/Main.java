package test4.sub4;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("자바 프로그래밍", "제임스 고슬링", "101-1234-1001");
		
		Member mem = new Member("홍길동", "A001");
		
		book.getBookInfo();
		System.out.println("============");
		
		mem.borrowBook(book);
		System.out.println("============");
		
		book.getBookInfo();
		System.out.println("============");
		
		mem.getMemberInfo();
		System.out.println("============");
		
		mem.borrowBook(book);
		System.out.println("============");
		
		mem.returnBook(book);
		System.out.println("============");
		
		mem.getMemberInfo();
		System.out.println("============");

	}

}
