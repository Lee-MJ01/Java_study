package study;

import java.util.Scanner;
import java.util.Stack;

public class B10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < r; i++) {
			st.add(sc.nextInt());
			if(st.peek() == 0) {
				st.pop();
				st.pop();
			}
		}
		
		int sum = 0;
		for(int num : st) {
			sum += num;
		}
		System.out.println(sum);
		sc.close();
	}

}
