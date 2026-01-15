package test.codingTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AKIS_CodingTEST {
    /*
    *   로그 중 ERROR 레벨만 필터링

        날짜 기준 오름차순 정렬

        결과를 "YYYY-MM-DD MESSAGE" 형태로 반환
    *
    * */
    public static void main(String[] args) {
        String[] logs = {
                "2025-01-03 ERROR Disk failure",
                "2025-01-01 INFO System start",
                "2025-01-02 ERROR Network timeout",
                "2025-01-01 ERROR Memory overflow"
        };

        List<String> result = new ArrayList<>();
        for (String log : logs) {
            String[] parts = log.split(" ", 3);  //세개까지만 자르겠다

            if ("ERROR".equals(parts[1])) {
                result.add(parts[0] + " " + parts[2]);
            }
        }
        result.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println("result = " + result);



    }
}
