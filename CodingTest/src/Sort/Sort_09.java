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

public class Sort_09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		
		int N= Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			list.add(br.readLine());
		}
		List<String> newList = list.stream().distinct().collect(Collectors.toList());
		Collections.sort(newList ,(e1,e2) ->{
			if (e1.length() == e2.length()) {
		        return e1.compareTo(e2); // 길이가 같으면 문자열 사전순으로 정렬
		    } else {
		        return e1.length() - e2.length(); // 길이가 다르면 길이를 기준으로 정렬
		    }
		});

		for (String item : newList) {
			System.out.println(item);
		}
		
	}

}
