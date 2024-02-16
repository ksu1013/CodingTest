package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Sort_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N= Integer.parseInt(br.readLine());
		
		String[][] array =new String[N][2];
		
		StringTokenizer st ;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = st.nextToken();
			array[i][1] = st.nextToken();
		}
		
		Arrays.sort(array, (e1,e2) -> 
		{
			if(Integer.parseInt( e1[0]) == Integer.parseInt( e2[0])) {
				return 0;
			}else {
				return Integer.parseInt( e1[0])-Integer.parseInt( e2[0]);
			}
			
		});


		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< N ; i++) {
			sb.append(array[i][0] + " " + array[i][1]).append('\n');
		}
		System.out.println(sb);
	}

}
