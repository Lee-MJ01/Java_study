package study;

import java.util.*;

public class B28278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Stack<Integer> arr = new Stack<Integer>();
		
		for (int i = 0; i < r; i++) {
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				int add_num = sc.nextInt();
				arr.push(add_num);
				break;
				
			case 2:
				if(arr.isEmpty()) {
					sb.append("-1\n");
					break;
				}
				sb.append(arr.pop()).append("\n");
				break;
				
			case 3:
				sb.append(arr.size()).append("\n");
				break;
				
			case 4:
				if(arr.isEmpty()) {
					sb.append("1").append("\n");
				}else sb.append("0").append("\n");
				break;
				
			case 5:
				if(arr.isEmpty()) {
					sb.append("-1").append("\n");
					break;
				}
				sb.append(arr.peek()).append("\n");
				break;
			}
		}
		System.out.print(sb);
		sc.close();
	}

}
