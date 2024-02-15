package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int point=sc.nextInt();
			list.add(point);
		}
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(k-1));
		
		
		
	}

}
