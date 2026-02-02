package test.codingTest;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun1929 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());

        // N개의 줄을 읽어오기
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = a; i<=b; i++){
            while (true){
                if(isPrime(i)){
                    System.out.println(i);
                    break;
                }
                if(i==b){
                    break;
                }else {
                    i++;
                }
            }
        }


        scanner.close();

    }

    private static boolean isPrime(int n){
        if (n <= 1) return false;  // 0, 1은 소수 아님
        if (n == 2) return true;   // 2는 소수
        if (n % 2 == 0) return false; // 짝수는 소수 아님 (2 제외)

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
