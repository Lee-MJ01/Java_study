package study;

import java.io.*;
import java.util.*;

public class B11650 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int r = Integer.parseInt(br.readLine());
		int[] x = new int[r];
		int[] y = new int[r];
		boolean x_y = true;
		for(int i = 0; i<r; i++) {
			if(x_y) {
				x[i] = br.read();
				br.read();
				x_y = false;
			}
			else {
				y[i] = br.read();
				x_y = true;
			}
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		for(int i = 0; i < x.length; i++) {
			sb.append(x[i]).append(" ").append(y[i]).append("\n");
		}
		System.out.print(sb);
	}

}

