package Utill;

import java.util.Scanner;

public class Utill_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		int three=sc.nextInt();
		
		System.out.println((one+two)%three);
		System.out.println(((one%three)+(two%three))%three);
		System.out.println((one*two)%three);
		System.out.println(((one%three)*(two%three))%three);
	}

}
