package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Map_08 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> set= new HashSet<String>();
		StringTokenizer st =  new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		
		st =  new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			set.add(st.nextToken());
		}
		int countA=0;
		st =  new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			String m= st.nextToken();
			
			if(set.contains(m)) {
				countA++;
			}
		}
		
		int countAB=(N-countA)+(M-countA);
		
		
		System.out.println(countAB);
		
		
	
	}	
}
