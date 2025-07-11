package study;

import java.util.Arrays;
import java.util.Scanner;

public class B10814 {

	static class Element implements Comparable<Element>{
		int age;
		String name;
		int order;
		
		Element(int age, String name, int order){
			this.age = age;
			this.name = name;
			this.order = order;
		}
		
		public int compareTo(Element o) {
			if (this.age == o.age)
				return Integer.compare(this.order, o.order);
			return Integer.compare(this.age, o.age);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		Element[] elements = new Element[r];
		for(int i = 0; i < r; i++) {
			elements[i] = new Element(sc.nextInt(),sc.next(),i);
		}
		Arrays.sort(elements);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < r; i++) {
			sb.append(elements[i].age).append(" ").append(elements[i].name)
			.append("\n");
		}
		System.out.println(sb);
		sc.close();

	}

}
