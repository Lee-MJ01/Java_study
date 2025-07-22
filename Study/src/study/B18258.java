package study;

import java.io.*;
import java.util.*;


public class B18258 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int r = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> queue = new ArrayDeque<Integer>();
		for(int i = 0; i < r; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String com = st.nextToken();
			
			
			switch (com) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.offer(num);
				break;

			case "front":
				if(queue.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(queue.peekFirst()).append("\n");
				break;
			case "back":
				if(queue.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(queue.peekLast()).append("\n");	
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				if(queue.isEmpty())
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
				break;
			case "pop":
				if(queue.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(queue.pollFirst()).append("\n");
				break;
				
			default:
				break;
			}
			
		}
		System.out.println(sb);
	}

}
