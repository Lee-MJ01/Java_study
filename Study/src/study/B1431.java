package study;

import java.util.*;

public class B1431 {
	static class E implements Comparable<E> {
        String str;
        int len;
        int sum;

        E(String s) {
            this.str = s;
            this.len = s.length();
            this.sum = calculateSum(s);
        }

        // 숫자만 더하는 메서드
        private int calculateSum(String s) {
            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    total += ch - '0';  // 문자 '0' 빼야 숫자로 됨
                }
            }
            return total;
        }

        @Override
        public int compareTo(E o) {
            // 1. 길이 비교
            if (this.len != o.len)
                return Integer.compare(this.len, o.len);

            // 2. 숫자 합 비교
            if (this.sum != o.sum)
                return Integer.compare(this.sum, o.sum);

            // 3. 사전순 비교
            return this.str.compareTo(o.str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());  // 개수 입력 받고

        E[] serials = new E[r];
        for (int i = 0; i < r; i++) {
            String line = sc.nextLine();
            serials[i] = new E(line);
        }

        Arrays.sort(serials);  // compareTo 기준으로 정렬

        for (E s : serials) {
            System.out.println(s.str);  // 정렬된 시리얼 번호 출력
        }

        sc.close();
    }

}






