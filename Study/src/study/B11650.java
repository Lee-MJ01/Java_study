package study;

import java.io.*;
import java.util.*;

public class B11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int r = Integer.parseInt(br.readLine());
		int [][] arr = new int[r][2];
		for(int i = 0; i < r; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (a,b) -> {
			if(a[0] != b[0])
				return a[0] - b[0];
			else
				return a[1] - b[1];
		});
		
		for(int i = 0; i < r; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.print(sb);
	}

}

