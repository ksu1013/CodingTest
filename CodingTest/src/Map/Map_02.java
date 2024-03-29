package Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Map_02 {
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String X = br.readLine();
		StringTokenizer st = new StringTokenizer(X);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set =new HashSet<String>();
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		int count=0;
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if(set.contains(str)) {
				count ++;
			}
		}
		
		System.out.println(count);
		
		
    }

}
