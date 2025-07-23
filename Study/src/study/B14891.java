package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

/*
 	회전----
 	시계방향 : 1
 	반시계방향 : -1
 	-------
 	
 	극-----
 	n극 : 0
 	s극 : 1
 	-------
 */

public class B14891 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Deque<Character>> list = new ArrayList<>();
		
		// 톱니 입력받기
		for(int i = 0; i< 4; i++) {
			list.add(new ArrayDeque<Character>());
			String str = br.readLine();
			for(char c : str.toCharArray()){
				list.get(i).add(c);
			}
		}
		
		// 회전수
		int r = Integer.parseInt(br.readLine());
		int num; // 입력받을 톱니 번호
		int s;	 // 입력받을 n 또는 s 극
		for(int i =0; i<r; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			cal(num, s, list);
			
		}
		
	}
	
	public static void cal(int num, int s, List<Deque<Character>> list) {
		boolean tnf;
		
		if(s == 1) {
			tnf = true;
		}else
			tnf = false;
		
		switch (num) {
		case 1: {
			gear1(list, tnf);
			break;
		}
		
		case 2: {
			gear2(list, tnf);
			break;
		}
		
		case 3: {
			gear3(list, tnf);
			break;
		}
		
		case 4: {
			gear4(list, tnf);
			break;
		}
		
		default:
			break;
		}
		
	}
	
	public static void gear1(List<Deque<Character>> list, boolean tnf) {
		
	}
	public static void gear2(List<Deque<Character>> list, boolean tnf) {
		Character[] g2 = list.get(2).toArray(new Character[0]);
		Character[] g1 = list.get(1).toArray(new Character[0]);
		Character[] g3 = list.get(3).toArray(new Character[0]);
		
		if(g2[2] != g1[6]) {
			if(tnf) {
				list.get(2).addLast(list.get(2).getFirst());
				list.get(2).pollFirst();
			}else {
				list.get(2).addFirst(list.get(2).getLast());
				list.get(2).pollLast();
			}
			gear2(list, !tnf);
		}else if(g3[6] != g4[2]) {
			if(tnf) {
				list.get(2).addLast(list.get(2).getFirst());
				list.get(2).pollFirst();
			}else {
				list.get(2).addFirst(list.get(2).getLast());
				list.get(2).pollLast();
			}
			gear4(list, !tnf);
		}
	}
	public static void gear3(List<Deque<Character>> list, boolean tnf) {
		Character[] g3 = list.get(2).toArray(new Character[0]);
		Character[] g2 = list.get(1).toArray(new Character[0]);
		Character[] g4 = list.get(3).toArray(new Character[0]);
		
		if(g3[2] != g2[6]) {
			if(tnf) {
				list.get(2).addLast(list.get(2).getFirst());
				list.get(2).pollFirst();
			}else {
				list.get(2).addFirst(list.get(2).getLast());
				list.get(2).pollLast();
			}
			gear2(list, !tnf);
		}else if(g3[6] != g4[2]) {
			if(tnf) {
				list.get(2).addLast(list.get(2).getFirst());
				list.get(2).pollFirst();
			}else {
				list.get(2).addFirst(list.get(2).getLast());
				list.get(2).pollLast();
			}
			gear4(list, !tnf);
		}
		
	}
	public static void gear4(List<Deque<Character>> list, boolean tnf) {
		
	}
}













