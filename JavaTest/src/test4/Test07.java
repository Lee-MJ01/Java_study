package test4;

import java.util.*;


/*
	날짜 : 2025/07/23
	이름 : 이민준
	내용 : 로또번호 문제
*/

public class Test07 {

	public static void main(String[] args) {
		for(int count = 1; count <= 5; count++) {
			System.out.println(makeLotto());
		}
	}
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		Random rand = new Random();
		for(;;) {
			int num = (int) Math.ceil(rand.nextDouble() * 45);
			/* 정답
			int num = (int) Math.ceil(Math.random() * 46);
			*/
			lottoSet.add(num);
			
			if(lottoSet.size() >= 6) {
				break;
			}
		}
		
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		return treeSet;
	}

}
