package test.codingTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backjun4948 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // N개의 줄을 읽어오기
        List<Integer> list = new ArrayList<>();

        while (true){
            String line = scanner.nextLine().trim();
            if(line.isEmpty() || line.equals("0")){
                break;
            }
            list.add(Integer.parseInt(line));
        }
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            count = isPrime(n).size();
            System.out.println("count = " + count);
        }
        scanner.close();

    }

    private static List<Integer> isPrime(int n){
        int k =2*n;
        List<Integer> list1 = new ArrayList<>();
        for (int i = n+1; i <= k; i++) {
            if(isPrime2(i)){
                list1.add(i);
            }
        }
        return  list1;
    }

    private static boolean isPrime2(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
