package test.codingTest;

import java.util.*;

public class AKIS_CodingTEST02 {
    /*
    *   권한 위반 로그만 추출

        같은 USER_ID 가 여러 번 위반한 경우 1번만 결과에 포함

        USER_ID 기준 사전순 정렬
        *
        * ROLE	허용 ACTION
          ADMIN	READ, WRITE, DELETE
          USER	READ, WRITE
          GUEST	READ
    *
    * */
    public static void main(String[] args) {
        String[] logs = {
                "u01 ADMIN DELETE",
                "u02 USER DELETE",
                "u03 GUEST WRITE",
                "u02 USER WRITE",
                "u03 GUEST READ"
        };

        Map<String, Set<String>> roleMap = new HashMap<>();

        roleMap.put("ADMIN",
                new HashSet<>(Arrays.asList("READ", "WRITE", "DELETE")));

        roleMap.put("USER",
                new HashSet<>(Arrays.asList("READ", "WRITE")));

        roleMap.put("GUEST",
                new HashSet<>(Collections.singletonList("READ")));

        /*
        *
        * "READ", "WRITE", "DELETE"
                ↓
            Arrays.asList → List
                ↓
            new HashSet → Set  여러 값을 한 번에 Set으로 만드는 가장 간단한 방법  불변
        *
        * */


        Set<String> resultSet = new HashSet<>();
        for (String log : logs) {
            String[] parts = log.split(" ",3);
            if(!roleMap.get(parts[1]).contains(parts[2])){
                resultSet.add(parts[0]);
            }

        }
        List<String> result = new ArrayList<>(resultSet);
        result.sort(Comparator.naturalOrder());
        System.out.println("resultSet = " + resultSet);


    }
}
