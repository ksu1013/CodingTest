package test.codingTest;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun13241 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // N개의 줄을 읽어오기
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        System.out.println(lcm(a, b));


        scanner.close();

    }

    // 최대공약수(GCD) 계산 (유클리드 호제법)
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM) 계산
    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));  // a * b 하면 오버플로우 가능성 있음
    }



}
