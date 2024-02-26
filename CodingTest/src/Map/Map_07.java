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

public class Map_07 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		StringTokenizer st =  new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		
		st =  new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			map.put(i,st.nextToken());
		}
		st =  new StringTokenizer(br.readLine());
		List<String> list =new ArrayList<String>();
		for (int i = 0; i < M; i++) {
			String m = st.nextToken();
			list.add(m);
		}
		System.out.println(map);
		System.out.println(list);
		
	
	}	
}
