package study;

import java.util.*;

public class B1920 {

	static class Element implements Comparable<Element> {
		int v;
		
		Element (int v) {
			this.v = v;
		}
		
		public int compareTo(Element o) {
			return Integer.compare(this.v, o.v);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		Element[] elements = new Element[r];
		for (int i = 0; i < r; i++) {
			elements[i] = new Element(sc.nextInt());
		}
		Arrays.sort(elements);
		
		r = sc.nextInt();
		// int [] result = new int[r+1];
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < r; i++) {
			int num = sc.nextInt();
			int start = 0;
			int end = r-1;
			boolean state = false;
			while(start <= end) {
				int mid = (start + end)/2;
				if(num < elements[mid].v) {
					end = mid-1;
				}else if(num > elements[mid].v) {
					start = mid + 1;
				}else if(num == elements[mid].v) {
					sb.append("1").append("\n");
					state = true;
					break;
				}
				
			}
			if(state == false)
				sb.append("0").append("\n");
		}
		System.out.println(sb);
		sc.close();
	}

}
