package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			int k1=sc.nextInt();
			list.add(k1);
			
		}
		
		Collections.sort(list);
		
		int sum=0;
		for (int item : list) {
			sum+=item;
		}
		
		int coverage=sum/5;
		System.out.println(coverage);
		System.out.println(list.get(2));
		
	}

}
