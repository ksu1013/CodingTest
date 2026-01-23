package test.codingTest;

import java.util.*;

public class AKIS_CodingTEST05 {
    /*
    *   비정상 사용자 ID 추출

        중복 제거

        사전순 정렬
    *
    * */
    public static void main(String[] args) {
        String[] logs = {
                "u01 09:00 LOGIN",
                "u01 09:30 LOGIN",
                "u02 10:00 LOGOUT",
                "u03 10:10 LOGIN",
                "u03 11:00 LOGOUT"
        };

        /*
        * Map<String, Boolean>

        상태 관리

        실무 세션 로직
        *
        * */

        Map<String, Boolean> loginState = new HashMap<>();
        Set<String> abnormalUsers = new HashSet<>();

        for (String log : logs) {
            String[] parts = log.split(" ", 3);
            String user = parts[0];
            String action = parts[2];

            boolean isLoggedIn = loginState.getOrDefault(user, false);
            /*
            * Boolean state = map.get(user);
                if (state == null) {
                    state = false;
                }
            * 키값이 있으면 벨류값을 가져오고
            *
            * */

            if ("LOGIN".equals(action)) {
                if (isLoggedIn) {
                    // 로그인 상태에서 다시 로그인 → 비정상
                    abnormalUsers.add(user);
                } else {
                    loginState.put(user, true);
                }
            } else { // LOGOUT
                if (!isLoggedIn) {
                    // 로그인 없이 로그아웃 → 비정상
                    abnormalUsers.add(user);
                } else {
                    loginState.put(user, false);
                }
            }
        }

    }
}
