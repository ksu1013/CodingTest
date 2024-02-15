package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		String k = br.readLine();
		String[] kArray=k.split("");
		for (int i = 0; i < kArray.length; i++) {
			list.add(Integer.parseInt(kArray[i]));
		}
		
		Collections.sort(list,Collections.reverseOrder());
		for(int item : list) {
			sb.append(item);
		}
		System.out.println(sb);
	}

}
