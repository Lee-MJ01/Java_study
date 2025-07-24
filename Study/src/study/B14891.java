package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class B14891 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Deque를 담을 List 생성
        List<Deque<Character>> gears = new ArrayList<>();

        // 4개의 톱니바퀴 정보 입력
        for (int i = 0; i < 4; i++) {
            gears.add(new ArrayDeque<>());
            String s = br.readLine();
            for (char c : s.toCharArray()) {
                gears.get(i).add(c);
            }
        }

        // 회전 횟수 입력
        int k = Integer.parseInt(br.readLine());

        // 회전 정보에 따라 K번 반복
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gearNum = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            // ======================================================
            // 1. 결정 단계: 어떤 톱니를 돌릴지 명령서(rotations) 만들기
            // ======================================================
            int[] rotations = new int[4];
            rotations[gearNum - 1] = direction;

            // 오른쪽으로 전파
            for (int j = gearNum - 1; j < 3; j++) {
                // 현재 톱니의 오른쪽(2)과 다음 톱니의 왼쪽(6) 극이 다르면
                if (gears.get(j).toArray(new Character[0])[2] != gears.get(j + 1).toArray(new Character[0])[6]) {
                    // 다음 톱니는 현재 톱니와 반대 방향으로 회전
                    rotations[j + 1] = -rotations[j];
                } else {
                    // 극이 같으면 연쇄 중단
                    break;
                }
            }

            // 왼쪽으로 전파
            for (int j = gearNum - 1; j > 0; j--) {
                // 현재 톱니의 왼쪽(6)과 이전 톱니의 오른쪽(2) 극이 다르면
                if (gears.get(j).toArray(new Character[0])[6] != gears.get(j - 1).toArray(new Character[0])[2]) {
                    // 이전 톱니는 현재 톱니와 반대 방향으로 회전
                    rotations[j - 1] = -rotations[j];
                } else {
                    // 연쇄 중단
                    break;
                }
            }

            // ======================================================
            // 2. 실행 단계: 결정된 명령서대로 톱니 회전
            // ======================================================
            for (int j = 0; j < 4; j++) {
                if (rotations[j] == 1) { // 시계 방향
                    gears.get(j).addFirst(gears.get(j).removeLast());
                } else if (rotations[j] == -1) { // 반시계 방향
                    gears.get(j).addLast(gears.get(j).removeFirst());
                }
            }
        }

        // ======================================================
        // 3. 점수 계산
        // ======================================================
        int totalScore = 0;
        if (gears.get(0).peekFirst() == '1') {
            totalScore += 1;
        }
        if (gears.get(1).peekFirst() == '1') {
            totalScore += 2;
        }
        if (gears.get(2).peekFirst() == '1') {
            totalScore += 4;
        }
        if (gears.get(3).peekFirst() == '1') {
            totalScore += 8;
        }

        System.out.println(totalScore);
    }
}