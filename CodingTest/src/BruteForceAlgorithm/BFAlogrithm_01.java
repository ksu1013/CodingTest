package BruteForceAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BFAlogrithm_01 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		
		int k1= sc.nextInt();
		int k2= sc.nextInt();
		
		for (int i = 0; i < k1; i++) {
			int k3=sc.nextInt();
			list.add(k3);
		}
		for (int i = 0; i < k1-2; i++) {
			for (int j = 1+i; j < k1-1; j++) {
				for (int j2 = 1+j; j2 < k1; j2++) {
					int one = list.get(i);
					int two = list.get(j);
					int three = list.get(j2);
					list2.add(one+two+three);
					
				}
			}
		}
		
		
		Collections.sort(list2);
		
		int count=0;
		for (int i = 0; i < list2.size(); i++) {
			if(list2.get(i) <= k2) {
				count++;
			}
		}
		
		
		System.out.println(list2.get(count-1));
	}

}
