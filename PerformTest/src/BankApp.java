import java.util.*;

class Account{
	private String ano; 	// 계좌번호
	private String owner;	// 입금주
	private int balance;	// 잔고
	
	// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// Getter, Setter
	// ...
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class BankApp {
	// 계좌 리스트
	private List<Account> accounts = new ArrayList<Account>();
	// 입력 스캐너 객체
	private Scanner scanner = new Scanner(System.in);
	
	// 메인 메서드
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");

	}
	// 각 기능을 하는 메서드s
	// ...
	
	public void start() {
		boolean running = true;
		
		while(running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch (choice) {
			case 1 -> createAccount();
			case 2 -> listAccounts();
			case 3 -> depositAccount();
			case 4 -> withdrawAccount();
			case 5 -> {
				running = false;
			}
			default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}
	}
	
	//
	public void printMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------------");
	}
	
	// 계좌생성 메서드
	public void createAccount() {
		// 입력 및 출력
		System.out.println("--------------- 계좌생성 ----------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		// Account list인 accounts에 입력받은 값을 바탕으로 객체 생성
		accounts.add(new Account(ano, owner, balance));
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	// 계좌목록 메서드
	public void listAccounts() {
		// 콘솔 출력
		System.out.println("--------------- 계좌목록 ----------------");
		// accounts의 size만큼 반복하여 모든 객체 출력
		for(Account acc : accounts) {
			System.out.printf("%s %s %d\n",
					acc.getAno(), acc.getOwner(), acc.getBalance());
		}
	}

	// 입금 메서드
	public void depositAccount() {
		// 입력
		System.out.println("--------------- 예금 ------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine(); // 계좌번호 입력
		System.out.print("예금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account acc = findAccount(ano);
		if(acc==null) { // 모두 순회하여 값이 일치하는 것이 없다면 예금 실패
			System.out.println("결과: 계좌가 없습니다.");
			
		}else { // 모두 순회하여 정확히 값이 일치한다면 예금액 입금
			acc.setBalance(acc.getBalance() +  balance);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
	}
	
	// 출금 메서드
	public void withdrawAccount() {
		// 입력
		System.out.println("--------------- 출금 ------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine(); // 계좌번호 입력
		System.out.print("출금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account acc = findAccount(ano);
		if(acc==null) { // 모두 순회하여 값이 일치하는 것이 없다면 예금 실패
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			
		}else { // 모두 순회하여 정확히 값이 일치한다면 예금액 입금
			acc.setBalance(acc.getBalance() -  balance);
			System.out.println("결과: 출금이 성공되었습니다.");
		}
		
	}
	
	// 계좌검색 메서드
	public Account findAccount(String ano) {
		for(Account acc : accounts) {
			// 모두 순회하여 정확히 값이 일치한다면 해당 계좌 리턴
			if(acc.getAno().equals(ano)) { 
				return acc;
			}
		}
		return null;
	}
}