package study;

import java.util.Arrays;
import java.util.Scanner;

public class B1181 {
	public static class E implements Comparable<E> {
		int len;
		String str;
		
		public E(String str) {
			this.str = str;
			this.len = str.length();
		}
		
		@Override
		public int compareTo(E o) {
			
			if(this.len != o.len)
				return Integer.compare(this.len, o.len);
			
			return this.str.compareTo(o.str);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.nextLine());
		
		E[] e = new E[r];
		
		for(int i = 0; i < r; i++) {
			String str = sc.nextLine();
			e[i] = new E(str);
		}
		
		Arrays.sort(e);
		
		for(int i = 0; i < r-1; i++) {
			if(e[i].str.equals(e[i+1].str)) {
				e[i] = null;
			}
		}
		
		for(E a : e) {
			if(a == null)
				continue;
			System.out.println(a.str);
		}
		
		sc.close();
	}

}









