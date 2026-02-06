package test.codingTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun4134 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // N개의 줄을 읽어오기
        List<Long> list = new ArrayList<>();
        long a = Long.parseLong(scanner.nextLine());
        for (int i=0; i<a; i++){
            long b = Long.parseLong(scanner.nextLine());
            list.add(b);
        }

        for (int i = 0; i < list.size(); i++) {
            long n = list.get(i);

            while (true) {
                if (isPrime(n)) {
                    System.out.println(n);  // 출력은 문제에서 요구한 값만!
                    break;
                }
                n++;
            }
        }

        scanner.close();

    }

    private static boolean isPrime(Long n){
        if (n <= 1) return false;  // 0, 1은 소수 아님
        if (n == 2) return true;   // 2는 소수
        if (n % 2 == 0) return false; // 짝수는 소수 아님 (2 제외)

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
