package study;

import java.util.*;

public class B1015_master {
    static class Element implements Comparable<Element> {
        int value;
        int originalIndex;

        Element(int value, int originalIndex) {
            this.value = value;
            this.originalIndex = originalIndex;
        }

        @Override
        public int compareTo(Element o) {
            return Integer.compare(this.value, o.value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        Element[] elements = new Element[r];
        for (int i = 0; i < r; i++) {
            elements[i] = new Element(sc.nextInt(), i);
        }

        Arrays.sort(elements);  // 값 기준 정렬

        int[] result = new int[r];
        for (int i = 0; i < r; i++) {
            result[elements[i].originalIndex] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : result) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
        
        sc.close();
    }
}

