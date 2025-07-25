package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		int[] arr = new int[r];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < r; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int sum = 0;
		int total = 0;
		for(int i = 0; i < r; i++) {
			sum += arr[i];
			total += sum;
		}
		System.out.println(total);
	}
	
}
