package BruteForceAlgorithm;

import java.util.Scanner;

public class BFAlogrithm_05 {
    public static void main(String[] args) {

    	
    	Scanner sc= new Scanner(System.in);
    	int k= sc.nextInt();
    	
    	int num=666;
    	int count=0;

    	while (true) {
			
    		 if (String.valueOf(num).contains("666")) {
                 count++;
                 if (count == k) {
                     System.out.println(num);
                     break;
                 }
             }
             num++;
		}
    	
    	
    }
}
