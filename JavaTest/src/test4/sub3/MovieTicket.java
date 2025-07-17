package test4.sub3;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	public void bookTicket() {
		if(isBooked)
			System.out.println("이미 예매됨");
		else {
			System.out.printf("%s, %s, %s 예매 완료\n", movieTitle, screenTime, seatNumber);
			this.isBooked = true;
			}
	}
	public void cancelBook() {
		if(!isBooked)
			System.out.println("아직 예매 안됨");
		else {
			System.out.printf("%s, %s, %s 취소 완료\n", movieTitle, screenTime, seatNumber);
			this.isBooked = false;
			}
	}
	public void printTicketInfo() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		if(isBooked)
			System.out.println("예매여부 : Yes");
		else
			System.out.println("예매여부 : No");
	}

}
