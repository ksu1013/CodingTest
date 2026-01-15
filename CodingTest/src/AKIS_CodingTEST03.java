package test.codingTest;

import java.util.*;

public class AKIS_CodingTEST03 {
    /*
    *   총 장애 시간을 분(minute) 단위로 계산

        DOWN 이 여러 번 발생할 수 있음
    *
    * */
    public static void main(String[] args) {
        String[] logs = {
                "09:00 UP",
                "10:15 DOWN",
                "10:45 UP",
                "13:20 DOWN",
                "14:00 UP"
        };

        boolean check = false; // DOWN 상태 여부
        int total = 0;
        int downStart = 0;

        for (String log : logs) {
            String[] parts = log.split(" ", 2);
            int currentTime = toMinutes(parts[0]);

            if ("DOWN".equals(parts[1])) {
                check = true;
                downStart = currentTime; // DOWN 시작 저장
            } else if (check) { // UP 이면서 이전이 DOWN
                total += (currentTime - downStart);
                check = false; // 상태 복구
            }
        }

        System.out.println(total);
    }

    private static int toMinutes(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}
