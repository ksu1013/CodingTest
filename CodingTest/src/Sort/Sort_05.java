package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		int[] Array=new int[k];
		
		for (int i = 0; i < k; i++) {
			int k1=Integer.parseInt(br.readLine());
			Array[i]=k1;
			
		}
		
		Arrays.sort(Array);
		
		for(int value : Array) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		
	}

}
