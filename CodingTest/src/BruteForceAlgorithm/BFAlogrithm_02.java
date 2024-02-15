package BruteForceAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BFAlogrithm_02 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        List<Integer> list =new ArrayList<Integer>();

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            String[] Array=String.valueOf(i).split("");
            int k=0;
            for (int j = 0; j < Array.length; j++) {
                int k2=Integer.parseInt(Array[j]);
                k=k+k2;
            }
            int k3=i+k;
            list.add(k3);
            if(k3==x) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}
