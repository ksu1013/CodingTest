package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Map_03 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String X = br.readLine();
		StringTokenizer st = new StringTokenizer(X);
		
		int N = Integer.parseInt(st.nextToken());
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		HashMap<String , Boolean> map=new HashMap<String, Boolean>();
		
		for(String name : set) {
			
			String[] key= name.split(" ");
			if (key[1].equals("enter")) {
	            map.put(key[0], true); // 출입 상태를 true로 설정
            } else if (key[1].equals("leave")) {
                map.remove(key[0]); // 해당 사람의 출입 정보 삭제
            }
			
		}
        
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList,Collections.reverseOrder());
        for (String key : keyList) {
            System.out.println(key );
        }
		
    }
	
	
/*

public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		입력에서 첫 번째 줄에는 회사에 있는 직원의 수 N이 주어지는 것이 아니라, N개의 출입 기록이 주어지는 것입니다. 
		따라서 첫 번째 줄을 읽고 StringTokenizer를 사용하여 N을 읽지 말고, 그냥 반복문을 통해 N번 입력을 받아야 합니다.
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		HashMap<String, Boolean> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
            String name = input[0];
            String action = input[1];

            if (action.equals("enter")) {
                map.put(name, true); // 출입 상태를 true로 설정
            } else {
                map.remove(name); // 해당 사람의 출입 정보 삭제
            }
			
		}
        
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList,Collections.reverseOrder());
        for (String key : keyList) {
            System.out.println(key );
        }
		
    }
*/	
}
