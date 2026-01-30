package test.codingTest;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backjun1735 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // N개의 줄을 읽어오기
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(scanner.nextLine());
        c = Integer.parseInt(st2.nextToken());
        d = Integer.parseInt(st2.nextToken());

        //int c = gcd(a,b);

        int k = (a*d)+(c*b);
        int k1 = (b*d);
        int k2 = gcd(k,k1);
        System.out.print(k/k2+" "+k1/k2);
        scanner.close();

    }

    private static int gcd(int a, int b){
        while (b!=0){
            int temp =b;
            b= a % b;
            a=temp;
        }
        return  a;
    }


}
