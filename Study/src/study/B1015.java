package study;

import java.util.*;

public class B1015 {
	static class Element implements Comparable<Element> {
		int v;
		int index;
		
		Element(int v, int index){
			this.v = v;
			this.index = index;
		}
		
		public int compareTo(Element o) {
			return Integer.compare(this.v, o.v);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		Element[] elements = new Element[r];
		for(int i = 0; i<r; i++) {
			elements[i] = new Element(sc.nextInt(),i);
		}
		
		Arrays.sort(elements);
		
		int[] result = new int[r];
		for(int i = 0; i < r; i++) {
			result[elements[i].index] = i;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int val: result) {
			sb.append(val).append(" ");
		}
		System.out.println(sb);
		sc.close();
	}

}









