package study;

import java.util.*;
import java.io.*;

public class B2751 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < r; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		list.sort((a,b) -> {
			return a.compareTo(b);
		});
		
		StringBuilder sb = new StringBuilder();
		for(int a : list) {
			sb.append(a).append("\n");
		}
		System.out.println(sb);
		sc.close();
	}

}
