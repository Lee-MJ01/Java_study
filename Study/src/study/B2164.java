package study;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B2164 {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int r = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= r; i++) {
			deque.offer(i);

		}	
		boolean tf = true;
		while(deque.size() > 1) {
			if(tf) { 
				deque.pollFirst();
				tf = false;
			}
			else {
				int num = deque.pollFirst();
				deque.offer(num);	
				tf = true;
			}
					
		}
		System.out.println(deque.peek());
		sc.close();

	}

}
