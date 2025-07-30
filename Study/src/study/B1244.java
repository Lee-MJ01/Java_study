package study;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1244 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int r= Integer.parseInt(sc.nextLine());
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int[] result = new int[r];
		for(int i = 0; i < r; i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		
		r = Integer.parseInt(sc.nextLine());
		int[][] arr = new int [r][2];
		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(sc.nextLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		result_func(result, arr);
		StringBuilder sb = new StringBuilder();
		for(int i : result) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
		sc.close();
	}
	
	public static void result_func(int[] result, int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			int gender = arr[i][0];
			int num = arr[i][1];
			if(gender == 1) {
				for(int j = num; j <= result.length; j += num) {
					result[j-1] = 1 - result[j-1];
				}
			}else {
				result[num-1] = 1 - result[num-1];
				for(int j = 1; j < result.length; j++) {
					int left = num-1-j;
					int right = num-1+j;
					if(left < 0 || right >= result.length) break;
					if(result[left] == result[right]) {
						result[left] = 1 - result[left];
						result[right] = 1 - result[right];
					} else {
						break;
					}
				}
			}
		}
	}

}