package test.codingTest;

import java.util.*;

public class AKIS_CodingTEST04 {
    /*
    *   실패(FAIL)한 JOB_ID만 추출

        같은 JOB_ID가 여러 번 실패해도 1번만 포함

        JOB_ID 기준 오름차순 정렬
    *
    * */
    public static void main(String[] args) {
        String[] logs = {
                "B01 2025-01-01 SUCCESS",
                "B02 2025-01-01 FAIL",
                "B01 2025-01-02 FAIL",
                "B03 2025-01-02 SUCCESS",
                "B02 2025-01-03 FAIL"
        };

        Set<String> set = new HashSet<>();
        for(String list : logs){
            String[] listArray = list.split(" ",3);
            if("FAIL".equals(listArray[2])){
                set.add(listArray[0]);
            }
        }

        List<String> stringList = new ArrayList<>(set);
        stringList.sort(Comparator.naturalOrder());
        System.out.println("stringList = " + stringList);


    }

}
