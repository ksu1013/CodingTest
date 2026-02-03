package test.codingTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun1934 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄: 정수 N 읽기
        int N = Integer.parseInt(scanner.nextLine());



        // N개의 줄을 읽어오기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(lcm(a, b));
        }


        scanner.close();

    }

    // 최대공약수(GCD) 계산 (유클리드 호제법)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM) 계산
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));  // a * b 하면 오버플로우 가능성 있음
    }

}
