package test5;

public class Test02 {

	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 0; i < 7; i++) {
			if(i <= 3) {
				cnt++;
			}
			else
				cnt--;
			
			for(int j = 1; j < 5 - cnt; j++) {
				System.out.print("☆");
			}
			for(int k = 1; k < cnt*2; k++) {
				System.out.print("★");
			}
			for(int j = 1; j < 5 - cnt; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println();
	}

}
