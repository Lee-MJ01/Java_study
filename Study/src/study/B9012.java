package study;

import java.util.*;

public class B9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String str;
		for(int i = 0; i < r; i++) {
			str = sc.nextLine();
			sb.append(VPS(str)).append("\n");
		}

		System.out.println(sb);
		sc.close();
	}
	
	public static String VPS(String str) {
		Stack<Character> st = new Stack<Character>();
		
		for(char c : str.toCharArray()) {
			if(c == '(')
				st.push(c);
			else {
				if(st.isEmpty()) {
					return "NO";
				}
				else
					st.pop();
			}
		}
		if(st.isEmpty())
			return "YES";
		else
			return "NO";
	}
}