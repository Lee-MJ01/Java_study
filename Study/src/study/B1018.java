package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		StringTokenizer st = new StringTokenizer(line);
		int r1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		
		String[] str = new String[r1];
		for(int i = 0; i < r1; i++) {
			str[i] = br.readLine();
		}
		int cnt = 0;
		int min=64;
		for(int i = 0; i < r1-7; i++) {
			char[] chars = str[i].toCharArray();
			for(int j = 0; j < r2-7; j++) {
				char c = chars[j]; 
				cnt = 0;
				for(int y = 0; y < 8; y++) {
					for(int x = 1; x < 8; x++) {
						if(y > 0) {
							
						}
						if(c == chars[x] && chars[x] == 'B') {
							cnt++;
							chars[x] = 'W';
						}else if(c == chars[x] && chars[x] == 'W') {
							cnt++;
							chars[x] = 'B';
						}
					}
				}
				if(cnt < min) min = cnt;
			}
		}
		System.out.println(cnt);

	}

}
