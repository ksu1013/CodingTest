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

public class Map_04 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 1; i <= N; i++) {
			map.put(i, br.readLine());
		}
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < M; i++) {
			list.add(br.readLine());
		}
		
		
		for (String item : list) {
			for (Entry<Integer, String> entry : map.entrySet()) {  
				try {
					if(entry.getKey() == Integer.parseInt(item)) {
						System.out.println(entry.getValue());
					}
				}catch (Exception e) {
					
					if (entry.getValue().equals(item)) {        
						System.out.println(entry.getKey()); 
					}
				}
				
			}
			
		}
		
	
	}
	
	
	
	/*
	 * public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Map<String, Integer> nameToIndex = new HashMap<>();
        Map<Integer, String> indexToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToIndex.put(name, i);
            indexToName.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                // 숫자일 경우
                int index = Integer.parseInt(query);
                sb.append(indexToName.get(index)).append("\n");
            } else {
                // 문자열일 경우
                sb.append(nameToIndex.get(query)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
	 * 
	 * */

}
