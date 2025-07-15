package study;

import java.util.Scanner;

public class B1021 {
	static class E implements Comparable<E> {
		int v;
		int index;
		
		public E(int v, int index){
			this.index = index;
			this.v = v;
		}
		
		public int compareTo(E o) {
			return Integer.compare(this.v, o.v);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt(); // 큐 size
		int r = sc.nextInt();	 // 입력받을 횟수
		
		
		
		for(int i = 0; i < r; i++) {
			
		}

	}

}
