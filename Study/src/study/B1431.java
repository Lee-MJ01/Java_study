package study;

import java.util.Arrays;
import java.util.Scanner;

public class B1431 {
	static class E implements Comparable<E> {
		private String str;
		private int v;
		protected int sum;
		static int cnt;
		
		E(String s, int v){
			this.v = v;
			this.str = s;
			cnt = 0;
		}
		
		@Override
		public int compareTo(E o) {
			if(cnt++ > 0) {
				return Integer.compare(sum, o.sum);
			}
			return Integer.compare(v, o.v);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		// String[] str = new String[r];
		// String[] result = new String[r];
		// int len;
		
		E[] e = new E[r];
		for(int i = 0; i < r; i++) {
			String str = sc.nextLine();
			int len = str.length();
			e[i] = new E(str, len);
		}
		Arrays.sort(e);

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < e[i].v; j++) {
				
				if(Character.isDigit(e[i].str.charAt(j))) {
					e[i].sum += e[i].str.charAt(j);
				}
			}
			
		}
		Arrays.sort(e);
		for(E s : e) {
			System.out.println(s.str);
		}
		sc.close();
	}

}






