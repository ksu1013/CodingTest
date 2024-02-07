package Utill;

import java.util.ArrayList;
import java.util.Scanner;

public class Utill_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		
		int gub=one*two;
		
		ArrayList<Integer> arrNum = new ArrayList<Integer>(3);

		while (two>0) {
			arrNum.add(two % 10);
			two /= 10;
		}
		
		
		for (int i = 0; i < arrNum.size(); i++) {
			System.out.println(one*arrNum.get(i));
		}
		System.out.println(gub);
	}

}
