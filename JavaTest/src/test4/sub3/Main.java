package test4.sub3;

public class Main {

	public static void main(String[] args) {
		MovieTicket movie = new MovieTicket("타이타닉", "19:00", "A1");
		
		movie.printTicketInfo();
		System.out.println("============");
		
		movie.bookTicket();
		System.out.println("============");
		
		movie.printTicketInfo();
		System.out.println("============");
		
		movie.bookTicket();
		System.out.println("============");
		
		movie.cancelBook();
		System.out.println("============");
		
		movie.printTicketInfo();
		System.out.println("============");
		
		movie.cancelBook();
		System.out.println("============");

	}

}
