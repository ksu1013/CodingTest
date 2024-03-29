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

public class Sort_07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		int N= Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		

		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];  
				//-2 1
				//만약 e1[1]이 e2[1]보다 작으면 음수를 반환하여 e1을 e2보다 앞에 위치하도록 하고, 
				//e1[1]이 e2[1]보다 크면 양수를 반환하여 e1을 e2보다 뒤에 위치하도록 합니다. 만약 두 y 좌표가 같다면 0을 반환하여 순서를 바꾸지 않습니다.
			} else {
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< N ; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);
		
		
	}

}
