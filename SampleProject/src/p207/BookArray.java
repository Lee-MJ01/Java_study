package p207;

import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Book[] b = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<b.length; i++) {
			System.out.print("제목>> ");
			String title = sc.nextLine();
			System.out.print("저자>> ");
			String author = sc.nextLine();
			b[i] = new Book(title, author);
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("(" + b[i].title + ", " + b[i].author + ")");
		}
		sc.close();

	}

}
