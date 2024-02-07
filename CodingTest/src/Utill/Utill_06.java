package Utill;

import java.util.Scanner;

public class Utill_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		
		int hab=one+two;
		int ma=one-two;
		int gub=one*two;
		int div=one/two;
		int namegi=one%two;
		
		System.out.println(hab);
		System.out.println(ma);
		System.out.println(gub);
		System.out.println(div);
		System.out.println(namegi);
	}
}
