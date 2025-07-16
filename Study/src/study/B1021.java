package study;

import java.util.*;

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
		
		// Queue 자료형 선언
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i = 0; i < size; i++) {
			queue.offer(i+1);
		}
		
		// 입력받은 인덱스 숫자 정렬하기 위한 E 클래스 선언
		E[] e = new E[r];
		for(int i = 0; i < r; i++) {
			e[i] = new E(sc.nextInt(), i);
		}
		Arrays.sort(e);
		
		sc.close();
		
		
		
	}

}
