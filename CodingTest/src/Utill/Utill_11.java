package Utill;

import java.util.Scanner;

public class Utill_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String one=sc.nextLine();

		
		
		long k2=0;
		long k3=0;
		String[] k=one.split(" ");
		for (int i = 0; i < k.length; i++) {
			k2=Long.parseLong(k[i]);
			k3=k3+k2;
		}
		System.out.println(k3);
		
	}

}
