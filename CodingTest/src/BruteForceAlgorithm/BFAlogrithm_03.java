package BruteForceAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BFAlogrithm_03 {
	public static void main(String[] args) {

    	List<Integer> list =new ArrayList<Integer>();

    	Scanner sc= new Scanner(System.in);
    	String k=sc.nextLine();
    	
    	String[] k1= k.split(" ");
    	
		int a=Integer.parseInt(k1[0]);
    	int b=Integer.parseInt(k1[1]);
    	int c=Integer.parseInt(k1[2]);
    	int d=Integer.parseInt(k1[3]);
    	int e=Integer.parseInt(k1[4]);
    	int f=Integer.parseInt(k1[5]);
    	
    	
    	//x=(c-by)/a
    	//x=(f-ey)/d
    	
    	for (int x = -999; x <= 999; x++) {
    		for (int y = -999; y <= 999 ; y++) {
                if(a * x + b * y == c && d * x + e * y == f ) {
                	System.out.println(x  + " " + y);
                	break;
                }

            }
		}
    	
    	

    	
    	
    }
}
