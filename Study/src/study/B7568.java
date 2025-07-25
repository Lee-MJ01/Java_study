package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B7568 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		int[][] people = new int[r][2]; // [i][0]는 몸무게, [i][1]은 키

		for(int i = 0; i < r; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    people[i][0] = Integer.parseInt(st.nextToken());
		    people[i][1] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0; i < r; i++) {
		    int rank = 1; // 모두 1등으로 시작
		    for(int j = 0; j < r; j++) {
		        // i와 j를 비교
		        if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
		            // 나보다 덩치 큰 사람을 만나면 등수 1 증가
		            rank++;
		        }
		    }
		    System.out.print(rank + " ");
		}
		
		
	}

}












