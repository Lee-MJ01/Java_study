package study;

import java.util.*;

public class B11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int won = sc.nextInt();
		int[] arr = new int[r];
		
		for(int i = 0; i < r; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i = r-1; i >= 0 ; i--) {
			if(won > arr[i]) {
				result += won/arr[i];
				won %= arr[i];
			}
		}
		System.out.println(result);
	}

}
