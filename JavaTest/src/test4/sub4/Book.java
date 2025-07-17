package test4.sub4;

public class Book {
	protected String title;
	protected String author;
	protected String isbn;
	protected boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false; // 대출 가능
	}
	public void borrowBook() {
		if(isBorrowd)
			System.out.println(title + " 이미 대출됨");
		else {
			System.out.printf("도서대출 : %s\n", title);
			isBorrowd = true; // 대출 불가능
			}
	}
	public void returnBook() {
		if(!isBorrowd)
			System.out.println(title + "이미 반납됨");
		else {
			System.out.printf("도서반납 : %s\n", title);
			isBorrowd = false;
			}
	}
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		if(!isBorrowd)
			System.out.println("대출여부 : 가능");
		else
			System.out.println("대출여부 : 불가능");
	}
	public String getTitle() {
		return this.title;
	}

}
