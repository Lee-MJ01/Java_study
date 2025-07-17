package study;

import java.util.*;

public class B1181_v2 { // set 사용

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = Integer.parseInt(sc.nextLine());
		
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < r; i++) {
			set.add(sc.nextLine());
		}
		
		List<String> list = new ArrayList<>(set);
		
		list.sort((a,b) ->{
			if(a.length() != b.length()) {
				return Integer.compare(a.length(), b.length());
			}
			return a.compareTo(b);
		});
		
		for(String s : list) {
			System.out.println(s);
		}
		
		sc.close();

	}

}
