package test.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ZipHabTest08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sk = new StringTokenizer(br.readLine());

        String k =sk.nextToken();

        // 서로 다른 부분 문자열을 저장할 Set
        HashSet<String> uniqueSubstrings = new HashSet<>();

        // 모든 부분 문자열 추출
        for (int start = 0; start < k.length(); start++) {
            for (int end = start + 1; end <= k.length(); end++) {
                String substring = k.substring(start, end);
                uniqueSubstrings.add(substring);
            }
        }
        System.out.println(uniqueSubstrings.size());

    }
}
