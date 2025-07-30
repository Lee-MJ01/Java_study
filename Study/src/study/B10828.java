package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<r; i++) {
			String command = br.readLine();
			StringTokenizer stt = new StringTokenizer(command);
			switch (stt.nextToken()) {
				case "pop": {
					if (st.isEmpty()) {
						sb.append(-1).append("\n");
					}else {
						sb.append(st.pop()).append("\n");
					}
					break;
				}
				case "size": {
					sb.append(st.size()).append("\n");		
					break;
				}
				case "empty": {
					if (st.isEmpty()) {
						sb.append(1).append("\n");
					}else {
						sb.append(0).append("\n");
					}
					break;
				}
				case "top": {
					if (st.isEmpty()) {
						sb.append(-1).append("\n");
					}else {
						sb.append(st.peek()).append("\n");
					}
					break;
				}
				case "push": {
					st.add(Integer.parseInt(stt.nextToken()));
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
}
