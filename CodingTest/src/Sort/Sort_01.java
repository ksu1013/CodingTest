package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			int k1=sc.nextInt();
			list.add(k1);
			
		}
		
		Collections.sort(list);
		
		for(int item : list) {
			System.out.println(item);
		}
	}

}
