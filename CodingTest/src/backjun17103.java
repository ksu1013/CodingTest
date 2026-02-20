package test.codingTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backjun17103 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        int a = Integer.parseInt(scanner.nextLine());
        int max = 0;
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            inputList.add(num);
            max = Math.max(max, num);
        }

        // 소수 배열 구하기
        boolean[] isNotPrime = getPrimeSieve(max);

        // 각 짝수에 대해 골드바흐 파티션 수 세기
        for (int even : inputList) {
            int count = 0;
            for (int i = 2; i <= even / 2; i++) {
                if (!isNotPrime[i] && !isNotPrime[even - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }


        scanner.close();

    }

    private static boolean[] getPrimeSieve(int max) {
        boolean[] isNotPrime = new boolean[max + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i * i <= max; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        return isNotPrime;
    }


}
