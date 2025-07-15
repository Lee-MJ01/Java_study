package sub2;

public class Book{

	private String title; // 책 제목
	private String author; // 저자 이름
	private String isbn; // ISBN 번호
	private int availableCopies; // 이용 가능한 복사본 수
	
	// 생성자 정의
	public Book(String titel, String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
		
	}
	
	
	//매서드
	public boolean borrowBook() {
		if(availableCopies <= 0) {
			return false;
			
		}
		else {
			availableCopies--;
			return true;
		}
	}
	
	public void returnBook() {
		availableCopies++;
	}
	
	public void show() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("저자 이름 : " + this.author);
		System.out.println("도서 번호 : " + this.isbn);
		System.out.println("이용 가능한 복사본 : " + this.availableCopies);
	}
	
	// Getter, Setter 설정
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	public static void main(String[] args) {
		
		
	}

}
